public class MyCombinedActivity extends AppCompatActivity {

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

        DatabaseHelper databaseHelper = new DatabaseHelper(this);

        String carePlanData = databaseHelper.getCarePlanSummary();
        String nutritionHydrationData = databaseHelper.getNutritionHydrationSummary();
        String supportReq1Data = databaseHelper.getSupportReqSummary1();
        String supportReqData = databaseHelper.getSupportReqSummary();
        String dietTimingData = databaseHelper.getDietTimingSummary();
        String drinkLikesData = databaseHelper.getDrinkLikesSummary();
        String sleepPatternData = databaseHelper.getSleepPatternSummary();
        String painSummaryData = databaseHelper.getPainSummary();
        String painScoreData = databaseHelper.getPainScore();
        String behaviouralManagementData = databaseHelper.getBehaviouralManagementSummary();

        carePlanSummaryTextView.setText(carePlanData);
        nutritionHydrationSummaryTextView.setText(nutritionHydrationData);
        supportReqSummary1TextView.setText(supportReq1Data);
        supportReqSummaryTextView.setText(supportReqData);
        dietTimingSummaryTextView.setText(dietTimingData);
        drinkLikesSummaryTextView.setText(drinkLikesData);
        sleepPatternSummaryTextView.setText(sleepPatternData);
        painSummaryTextView.setText(painSummaryData);
        painScoreTextView.setText(painScoreData);
        behaviouralManagementTextView.setText(behaviouralManagementData);
    }
}
