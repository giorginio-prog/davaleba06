package com.example.ge.msda.davaleba06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val products = ArrayList<Product>()
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))
        products.add(Product(1, "ერორი", "ერორი",R.drawable.ic_baseline_error_24,true))
        products.add(Product(2,"ძახილისნიშანი","ძახილისნიშანი",R.drawable.ic_baseline_priority_high_24,true))
        products.add(Product(3,"ღვინო","ღვინო",R.drawable.ic_baseline_wine_bar_24,false))

        val adapter = ProductAdapter(products)

        recyclerView.layoutManager =LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}