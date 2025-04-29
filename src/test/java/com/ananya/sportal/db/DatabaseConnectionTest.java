package com.ananya.sportal.db;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

public class DatabaseConnectionTest {

    @Test
    public void testConnection() {
        assertDoesNotThrow(() -> {
            Connection conn = DatabaseConnection.getConnection();
            assertNotNull(conn);
            conn.close();
        });
    }
}
