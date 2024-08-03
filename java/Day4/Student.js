class Student {
    constructor(id, name, grades = []) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    addGrade(grade) {
        this.grades.push(grade);
    }

    removeGrade(index) {
        if (index >= 0 && index < this.grades.length) {
            this.grades.splice(index, 1);
        }
    }

    calculateAverageGrade() {
        if (this.grades.length === 0) {
            return 0;
        }
        const sum = this.grades.reduce((acc, curr) => acc + curr, 0);
        return sum / this.grades.length;
    }

    static getStudentById(studentList, id) {
        return studentList.find(student => student.id === id);
    }

    updateStudent(name, grades) {
        if (name) {
            this.name = name;
        }
        if (grades) {
            this.grades = grades;
        }
    }
}

// Example usage:
let students = [];

// Function to add a student
function addStudent(id, name, grades) {
    const student = new Student(id, name, grades);
    students.push(student);
}

// Function to remove a student
function removeStudent(id) {
    students = students.filter(student => student.id !== id);
}

// Function to calculate average grades of a student by ID
function averageGradeById(id) {
    const student = Student.getStudentById(students, id);
    if (student) {
        return student.calculateAverageGrade();
    } else {
        return "Student not found";
    }
}

// Function to update student information
function updateStudent(id, name, grades) {
    const student = Student.getStudentById(students, id);
    if (student) {
        student.updateStudent(name, grades);
    } else {
        console.log("Student not found");
    }
}

// Example usage:
addStudent(1, "Alice", [85, 90, 88]);
addStudent(2, "Bob", [76, 82, 80]);

console.log(students);

removeStudent(1);

console.log(students);

console.log("Average grade of Bob:", averageGradeById(2));

updateStudent(2, "Bob Smith", [78, 84, 82]);

console.log(students);
console.log("Updated average grade of Bob:", averageGradeById(2));z