package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = Arrays.asList(
            new Product("Medicine X", "Antidepressant medication to manage mood disorders.", "Take one capsule daily in the morning.", "Avoid abrupt discontinuation; consult a doctor if experiencing worsening symptoms."),
            new Product("Medicine Y", "Blood pressure medication to reduce hypertension.", "Take one tablet daily with meals.", "Monitor blood pressure regularly. Avoid potassium supplements without medical advice."),
            new Product("Medicine Z", "Insulin injection for managing diabetes mellitus.", "Inject subcutaneously before meals as prescribed.", "Monitor blood glucose levels regularly. Store insulin in a refrigerator."),
            new Product("Medicine W", "Antacid for relief of acid indigestion and heartburn.", "Take one to two tablets after meals and at bedtime as needed.", "Do not exceed recommended dosage. Avoid long-term use without medical supervision."),
            new Product("Medicine V", "Anti-inflammatory medication for arthritis pain relief.", "Take one tablet twice daily with food.", "Use with caution in elderly patients. Monitor for gastrointestinal side effects."),
            new Product("Medicine U", "Anticoagulant to prevent blood clots.", "Take one tablet daily at the same time each day.", "Regular monitoring of blood clotting parameters required. Avoid activities with a high risk of injury."),
            new Product("Medicine T", "Thyroid hormone replacement therapy.", "Take one tablet daily on an empty stomach.", "Regular thyroid function tests. Avoid taking with calcium or iron supplements."),
            new Product("Medicine S", "Oral contraceptive for birth control.", "Take one tablet daily at the same time each day.", "Discuss potential interactions with other medications. Follow missed dose instructions carefully."),
            new Product("Medicine R", "Anti-anxiety medication for short-term relief of anxiety symptoms.", "Take one tablet as needed for anxiety attacks.", "May cause drowsiness; avoid alcohol. Monitor for signs of dependence."),
            new Product("Medicine Q", "Antifungal cream for topical treatment of fungal infections.", "Apply a thin layer to affected area twice daily.", "Wash hands before and after application. Avoid contact with eyes and mucous membranes.")
    );

    public List<Product> getAllProducts() {
        return products;
    }
}
