// Ratiorg got statues of different sizes as a present from CodeMaster
// for his birthday, each statue having an non-negative integer size.
// Since he likes to make things perfect, he wants to arrange them from
// smallest to largest so that each statue will be bigger than
// the previous one exactly by 1.

int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
    return statues[statues.length-1]-statues[0]-statues.length+1;
}
