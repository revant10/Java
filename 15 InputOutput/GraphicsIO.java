// Importing Packages
import java.io.*;
import java.awt.*;

class GraphicsIO extends Frame
{
    // Defining window elements
    TextField number, name, marks;
    Button enter, done;
    Label numLabel, nameLabel, markLabel;
    DataOutputStream dos;

    // Initialize the Frame
    public StudentFile()
    {
        super ("Create Student File");
    }

    // Setup the window
    public void setup()
    {
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        // Create the components of the Frame
        number = new TextField(25);
        numLabel = new Label("Roll Number");
        name = new TextField(25);
        nameLabel = new Label("Student Name");
        marks = new TextField(25);
        markLabel = new Label("Marks");
        enter = new Button("Enter");
        done = new Button("Done");

        // Adding components to the frame
        add(numLabel);
        add(number);
        add(name);
        add(nameLabel);
        add(markLabel);
        add(marks);
        add(enter);
        add(done);

        // Display Frame
        setVisible(true);

        // Open the file
        try {
            dos = new DataOutputStream(new FileOutputStream("student.txt"));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.exit(1);
        }
    }
    
    // Write to the file
}