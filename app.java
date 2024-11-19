import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class app {
    private static Stack<Integer> stack = new Stack<>();
    private static Queue<Integer> queue = new LinkedList<>();
    private static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the DSA Interactive App!");
        System.out.println("Type commands to interact with the Stack, Queue, or Linked List.");
        System.out.println("Available commands:\n" +
                "stack push <value> - Push to stack\n" +
                "stack pop - Pop from stack\n" +
                "queue add <value> - Add to queue\n" +
                "queue remove - Remove from queue\n" +
                "list add <value> - Add to linked list\n" +
                "list remove - Remove from linked list\n" +
                "display - Show all data structures\n" +
                "exit - Exit the application");

        while (true) {
            System.out.print("\nEnter command: ");
            String input = scanner.nextLine();
            String[] command = input.split(" ");

            if (command[0].equalsIgnoreCase("stack")) {
                handleStackCommand(command);
            } else if (command[0].equalsIgnoreCase("queue")) {
                handleQueueCommand(command);
            } else if (command[0].equalsIgnoreCase("list")) {
                handleListCommand(command);
            } else if (command[0].equalsIgnoreCase("display")) {
                displayAll();
            } else if (command[0].equalsIgnoreCase("exit")) {
                System.out.println("Exiting DSA Interactive App...");
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }

    private static void handleStackCommand(String[] command) {
        if (command[1].equalsIgnoreCase("push")) {
            try {
                int value = Integer.parseInt(command[2]);
                stack.push(value);
                System.out.println("Pushed " + value + " onto the stack.");
            } catch (Exception e) {
                System.out.println("Please enter a valid value.");
            }
        } else if (command[1].equalsIgnoreCase("pop")) {
            if (!stack.isEmpty()) {
                int value = stack.pop();
                System.out.println("Popped " + value + " from the stack.");
            } else {
                System.out.println("Stack is empty.");
            }
        } else {
            System.out.println("Invalid stack command.");
        }
    }

    private static void handleQueueCommand(String[] command) {
        if (command[1].equalsIgnoreCase("add")) {
            try {
                int value = Integer.parseInt(command[2]);
                queue.add(value);
                System.out.println("Added " + value + " to the queue.");
            } catch (Exception e) {
                System.out.println("Please enter a valid value.");
            }
        } else if (command[1].equalsIgnoreCase("remove")) {
            if (!queue.isEmpty()) {
                int value = queue.remove();
                System.out.println("Removed " + value + " from the queue.");
            } else {
                System.out.println("Queue is empty.");
            }
        } else {
            System.out.println("Invalid queue command.");
        }
    }

    private static void handleListCommand(String[] command) {
        if (command[1].equalsIgnoreCase("add")) {
            try {
                int value = Integer.parseInt(command[2]);
                linkedList.add(value);
                System.out.println("Added " + value + " to the linked list.");
            } catch (Exception e) {
                System.out.println("Please enter a valid value.");
            }
        } else if (command[1].equalsIgnoreCase("remove")) {
            if (!linkedList.isEmpty()) {
                int value = linkedList.removeFirst();
                System.out.println("Removed " + value + " from the linked list.");
            } else {
                System.out.println("Linked list is empty.");
            }
        } else {
            System.out.println("Invalid list command.");
        }
    }

    private static void displayAll() {
        System.out.println("\nCurrent state of data structures:");
        System.out.println("Stack: " + stack);
        System.out.println("Queue: " + queue);
        System.out.println("Linked List: " + linkedList);
    }
}
