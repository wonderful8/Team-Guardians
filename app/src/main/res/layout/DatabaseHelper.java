public class DatabaseHelper extends AppCompatActivity {

    private TextView carePlanSummaryTextView;
    private TextView nutritionHydrationSummaryTextView;
    private TextView supportReqSummary1TextView;
    private TextView supportReqSummaryTextView;
    private TextView dietTimingSummaryTextView;
    private TextView drinkLikesSummaryTextView;
    private TextView sleepPatternSummaryTextView;
    private TextView painSummaryTextView;
    private TextView painScoreTextView;
    private TextView behaviouralManagementTextView;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_combined);

        carePlanSummaryTextView = findViewById(R.id.carePlanSummary);
        nutritionHydrationSummaryTextView = findViewById(R.id.nutritionHydrationSummary);
        supportReqSummary1TextView = findViewById(R.id.supportReqSummary1);
        supportReqSummaryTextView = findViewById(R.id.supportReqSummary);
        dietTimingSummaryTextView = findViewById(R.id.dietTimingSummary);
        drinkLikesSummaryTextView = findViewById(R.id.drinkLikesSummary);
        sleepPatternSummaryTextView = findViewById(R.id.sleepPatternSummary);
        painSummaryTextView = findViewById(R.id.painSummary);
        painScoreTextView = findViewById(R.id.painScore);
        behaviouralManagementTextView = findViewById(R.id.behaviouralManagementSummary);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("carePlanSummary").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String carePlanData = dataSnapshot.getValue(String.class);
                carePlanSummaryTextView.setText(carePlanData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadCarePlanSummary:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("nutritionHydrationSummary").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String nutritionHydrationData = dataSnapshot.getValue(String.class);
                nutritionHydrationSummaryTextView.setText(nutritionHydrationData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadNutritionHydrationSummary:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("supportReqSummary1").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String supportReq1Data = dataSnapshot.getValue(String.class);
                supportReqSummary1TextView.setText(supportReq1Data);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadSupportReqSummary1:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("supportReqSummary").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String supportReqData = dataSnapshot.getValue(String.class);
                supportReqSummaryTextView.setText(supportReqData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadSupportReqSummary:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("dietTimingSummary").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String dietTimingData = dataSnapshot.getValue(String.class);
                dietTimingSummaryTextView.setText(dietTimingData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadDietTimingSummary:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("drinkLikesSummary").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String drinkLikesData = dataSnapshot.getValue(String.class);
                drinkLikesSummaryTextView.setText(drinkLikesData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadDrinkLikesSummary:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("sleepPatternSummary").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String sleepPatternData = dataSnapshot.getValue(String.class);
                sleepPatternSummaryTextView.setText(sleepPatternData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadSleepPatternSummary:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("painSummary").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String painSummaryData = dataSnapshot.getValue(String.class);
                painSummaryTextView.setText(painSummaryData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadPainSummary:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("painScore").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String painScoreData = dataSnapshot.getValue(String.class);
                painScoreTextView.setText(painScoreData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadPainScore:onCancelled", databaseError.toException());
            }
        });

        mDatabase.child("behaviouralManagementSummary").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String behaviouralManagementData = dataSnapshot.getValue(String.class);
                behaviouralManagementTextView.setText(behaviouralManagementData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "loadBehaviouralManagementSummary:onCancelled", databaseError.toException());
            }
        });


    }
}
