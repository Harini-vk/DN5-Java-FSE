function BookDetails() {

    const books = [
        {
            id: 1,
            title: "React Basics",
            author: "John"
        },
        {
            id: 2,
            title: "Learning Java",
            author: "James"
        }
    ];

    return (
        <div>

            <h2>Book Details</h2>

            {books.map((book) => (
                <div key={book.id}>
                    <p><b>Book:</b> {book.title}</p>
                    <p><b>Author:</b> {book.author}</p>
                    <hr />
                </div>
            ))}

        </div>
    );
}

export default BookDetails;