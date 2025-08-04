import java.util.*;
public class TeamAssignmentGame {

        static int minDiff = Integer.MAX_VALUE;
        static List<Integer> bestTeamA = new ArrayList<>();
        static List<Integer> bestTeamB = new ArrayList<>();

        public static void divideTeams(int[] skills) {
            int n = skills.length;
            List<Integer> teamA = new ArrayList<>();
            backtrack(skills, 0, teamA, n / 2);

            System.out.println("Team A: " + bestTeamA + " | Team B: " + bestTeamB);
        }

        // Try all combinations of N/2 players
        private static void backtrack(int[] skills, int index, List<Integer> teamA, int size) {
            if (teamA.size() == size) {
                List<Integer> teamB = new ArrayList<>();
                Set<Integer> setA = new HashSet<>(teamA);
                for (int skill : skills) {
                    if (!setA.contains(skill) || Collections.frequency(teamA, skill) < Collections.frequency(Arrays.stream(skills).boxed().toList(), skill)) {
                        teamB.add(skill);
                    }
                }
                int sumA = teamA.stream().mapToInt(i -> i).sum();
                int sumB = teamB.stream().mapToInt(i -> i).sum();
                int diff = Math.abs(sumA - sumB);

                if (diff < minDiff) {
                    minDiff = diff;
                    bestTeamA = new ArrayList<>(teamA);
                    bestTeamB = new ArrayList<>(teamB);
                }
                return;
            }

            if (index >= skills.length) return;

            // Include current player
            teamA.add(skills[index]);
            backtrack(skills, index + 1, teamA, size);
            teamA.remove(teamA.size() - 1);

            // Exclude current player
            backtrack(skills, index + 1, teamA, size);
        }

        public static void main(String[] args) {
            int[] skills = {10, 20, 30, 40};
            divideTeams(skills);
        }
    }


