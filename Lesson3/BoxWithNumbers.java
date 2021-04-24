package Lesson3;




    public class BoxWithNumbers<T extends Number> {
        private T[] nums;

        public BoxWithNumbers(T... nums) {
            this.nums = nums;
        }

        public T[] getNums() {
            return nums;
        }

        public void setNums(T[] nums) {
            this.nums = nums;
        }

        public double avg() {
            double sum = 0;
            for (T num : nums) {
                sum += num.doubleValue();
            }
            return sum / nums.length;
        }

        public boolean isSameAvg(BoxWithNumbers<? super Number> box) {
            return Math.abs(this.avg() - box.avg()) < 0.0001;
        }

        public static <U extends Number> U getFirstElement(BoxWithNumbers<U> boxWithNumbers) {
            return boxWithNumbers.nums[0];
        }

        public static void main(String[] args) {
            BoxWithNumbers<Integer> intBox1 = new BoxWithNumbers<>(6, 9, 57567);
            System.out.println(intBox1.avg());
            BoxWithNumbers<Integer> intBox2 = new BoxWithNumbers<>(1, 4, 5);
            BoxWithNumbers<Double> doubleBoxWithNumbers = new BoxWithNumbers<>(1.1, 1.6, 1.9);
        }
    }

