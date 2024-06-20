# Java Priority Queue Examples

This repository contains examples demonstrating the usage of various priority queue implementations in Java.

## Owner

This repository is owned by Aadarsh.

## Overview

Priority queues are data structures that allow elements to be inserted with an associated priority and retrieved according to their priority. This repository includes examples showcasing the usage of different priority queue implementations available in Java, such as `PriorityQueue`, `PriorityBlockingQueue`, `BlockingQueue`, `AbstractQueue`, etc.

## Hierarchy

- **PriorityQueue**: An implementation of the `AbstractQueue` interface. It provides a classic priority queue data structure.
  - **AbstractQueue**: An abstract class that provides skeletal implementations of some queue operations.
- **PriorityBlockingQueue**: A concurrent implementation of the `BlockingQueue` interface with priorities.
  - **BlockingQueue**: An interface that extends the `Queue` interface. It represents a queue that supports operations that wait for the queue to become non-empty when retrieving and removing elements.
- **Other Examples**:
  - `ConcurrentLinkedQueue`
  - `ArrayBlockingQueue`
  - `DelayQueue`
  - `LinkedBlockingQueue`
  - `LinkedTransferQueue`

## Examples

- `BlockingQueueExample`: Demonstrates the usage of `PriorityBlockingQueue`.
- `AbstractQueueExample`: Illustrates the usage of `PriorityQueue`.
- `PriorityQueueExample`: Shows how to use the `PriorityQueue` class to implement a priority queue.
- `PriorityBlockingQueueExample`: Provides an example of using `PriorityBlockingQueue`.

## Usage

Each example includes a `runExample()` method demonstrating how to use the respective priority queue implementation. Feel free to explore the code and modify it according to your requirements.

## Contribution

Contributions are welcome! If you have any suggestions, improvements, or additional examples to add, feel free to fork this repository and submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
