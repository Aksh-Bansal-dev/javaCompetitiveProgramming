with open("output.txt", encoding="utf8") as f:
    with open("output2.txt", encoding="utf8") as fe:
        for line in f:
            for linefe in fe:
                if line != linefe:
                    a_file = open("input.txt")
                    liness = a_file.readlines()
                    for test in liness:
                        print(test, end="")
                        print()
                    a_file.close()
                    # print(f"{line}")
                    print("______________________________________")
                    break
                else:
                    break
