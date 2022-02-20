package dataread;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class DataReaderTest extends DataReader {
    Scanner io = new Scanner ( String.valueOf (-1) );
    DataReader dataReader = new DataReader ();

    @Test
    void testGetInt() {
        dataReader.getInt ( );
    }

    @Test
    void testExit() {
    }
}