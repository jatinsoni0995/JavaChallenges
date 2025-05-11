//public class Challenge_PainterJob {
//
//    public static void main(String[] args) {
//
//        System.out.println(getBucketCount(3.4,2.1,1.5,2));
//        System.out.println(getBucketCount(3.4, 2.1,1.5));
//        System.out.println(getBucketCount(6.26,2.2));
//        System.out.println(getBucketCount(3.4,1.5));
//
//    }
//
//        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
//
//            if(width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0){
//
//                return -1;
//            }
//
//            double wallArea = width * height;
//            double remainingArea = wallArea - (areaPerBucket * extraBuckets);
//
//            if(wallArea <= (areaPerBucket * extraBuckets)){
//                return -1;
//            }
//         return getBucketCount(remainingArea, areaPerBucket);
//        }
//
//    public static int getBucketCount(double width, double height, double areaPerBucket){
//
//        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
//
//            return -1;
//        }
//
//        double totalArea = width * height;
//
//       return getBucketCount(totalArea,areaPerBucket);
//    }
//    public static int getBucketCount(double area, double areaPerBucket){
//
//        if(area <= 0 || areaPerBucket <= 0){
//            return -1;
//        }
//
//        int bucketNeeded = (int)Math.ceil(area / areaPerBucket);
//
//        return bucketNeeded;
//    }
//}

public class Challenge_PainterJob {
    public static void main(String[] args) {
        // Test cases with context
        System.out.println("Test 1 (3.4, 2.1, 1.5, 2): " + getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("Test 2 (3.4, 2.1, 1.5): " + getBucketCount(3.4, 2.1, 1.5));
        System.out.println("Test 3 (6.26, 2.2, 1.5): " + getBucketCount(6.26, 2.2, 1.5));
        System.out.println("Test 4 (3.4, 1.5, 1.5): " + getBucketCount(3.4, 1.5, 1.5));
    }

    // Calculate buckets needed considering extra buckets
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // Validate input parameters
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = width * height;
        double remainingArea = wallArea - (areaPerBucket * extraBuckets);

        // If extra buckets are enough to cover the area, no additional buckets needed
        if (wallArea <= (areaPerBucket * extraBuckets)) {
            return 0;
        }
        return getBucketCount(remainingArea, areaPerBucket);
    }

    // Calculate buckets needed for given width, height, and area per bucket
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalArea = width * height;
        return getBucketCount(totalArea, areaPerBucket);
    }

    // Calculate buckets needed for given area and area per bucket
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int bucketNeeded = (int) Math.ceil(area / areaPerBucket);
        return bucketNeeded;
    }
}
