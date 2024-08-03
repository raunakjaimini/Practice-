let arr = [];

class Product{
    constructor(id,name,category,price,stock){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;

    }

    
}

function addProduct(product){
    arr.push(product);


}

function removeProduct(id){
    arr = arr.filter(product => product.id == id);
}

function updateProduct(id,updatedInfo){
    let product= arr.find(product => product.id == id );
    if(product){
        product.assign(product,updatedInfo);
    }

}

function filterProductsByCategory(category){
    return arr.filter(product => product.category==category)
}

function getProduct(id){
    return arr.find(product => product.id==id);

}

function listProducts(){
    return arr;
}


let product1 = new Product(1,'Laptop','Electronics',1200,10);
let product2 = new Product(2,'Phone','Electronics',800,20);

console.log("All Products", listProducts());
console.log(addProduct(product1));
console.log(listProducts())