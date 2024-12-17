public static int binarySearch(String[] a1, String str)
    {
        int low = 0;
        int high = a1.length - 1;
        
        int indexOf = 0;
        
        while (low <= high)
        {
            int mid = (low + high) / 2;
            int isEqual = a1[mid].compareToIgnoreCase(str);
            
            if(a1[mid].equalsIgnoreCase(str))
            {
                indexOf = mid;
                return indexOf;
            }
            else if(isEqual <= 0)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return 0;
    }
