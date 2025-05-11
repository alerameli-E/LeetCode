public static int maximumNumberOfStringPairs(String[] words) {
        
        ArrayList<String> lista = new ArrayList<>();
        int pares = 0;
        for (String word : words) {
            char fc = word.charAt(0);
            char sc = word.charAt(1);
            StringBuilder sb = new StringBuilder();
            if (fc < sc) {
                sb.append(fc).append(sc);
            } else {
                sb.append(sc).append(fc);
            }
            String letters = sb.toString();

            if (!lista.contains(letters)) {
                lista.add((String)letters);
            } else {
                pares++;
                lista.remove(letters);
            }
        }
        return pares;
    }
