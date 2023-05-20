public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RadioGroup communicationRadioGroup = findViewById(R.id.communication);

        communicationRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.canCommunicateEffeciently:
                        communicationSelection("canCommunicateEffeciently");
                        break;
                    case R.id.needATranslator:
                        communicationSelection("needATranslator);
                        break;
                    case R.id.CommunicationOther:
                        communicationSelection("CommunicationOther");
                        break;
                    default:
                        break;
                }
            }
        });

        RadioGroup walkingRadioGroup = findViewById(R.id.walkingRadioGroup);

        walkingRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.weaknessRadioButton:
                        walkingSelection("weakness");
                        break;
                    case R.id.ableWalkRadioButton:
                        walkingSelection("ableWalk");
                        break;
                    case R.id.fatigueRadioButton:
                        walkingSelection("fatigue");
                        break;
                    default:
                        break;
                }
            }
        });
        RadioGroup eyesightRadioGroup = findViewById(R.id.eyesightRadioGroup);

        eyesightRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.glassesRadioButton:
                        eyesightSelection("glasses");
                        break;
                    case R.id.eyestrainRadioButton:
                        eyesightSelection("eyestrain");
                        break;
                    case R.id.normalEyesightRadioButton:
                        eyesightSelection("normalEyesight");
                        break;
                    default:
                        break;
                }
            }
        });

        RadioGroup hearingRadioGroup = findViewById(R.id.hearingRadioGroup);

        hearingRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.accurateHearingRadioButton:
                        hearingSelection("accurateHearing");
                        break;
                    case R.id.hearingAidRadioButton:
                        hearingSelection("hearingAid");
                        break;
                    case R.id.tinnitusRadioButton:
                        hearingSelection("tinnitus");
                        break;
                    default:
                        break;
                }
            }
        });
        RadioGroup nutritionRadioGroup = findViewById(R.id.nutritionRadioGroup);

        nutritionRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.fluidsRadioButton:
                        nutritionSelection("fluids");
                        break;
                    case R.id.proteinRadioButton:
                        nutritionSelection("protein");
                        break;
                    case R.id.deficiencyRadioButton:
                        nutritionSelection("deficiency");
                        break;
                    default:
                        break;
                }
            }
        });
        RadioGroup specialRadioGroup = findViewById(R.id.specialRadioGroup);

        specialRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.bowelBladderRadioButton:
                        specialSelection("bowel");
                        break;
                    case R.id.wheelchairRadioButton:
                        specialSelection("wheelchair");
                        break;
                    case R.id.showerRadioButton:
                        specialSelection("shower");
                        break;
                    case R.id.otherSpecialRadioButton:
                        specialSelection("otherSpecial");
                        break;
                    default:
                        break;
                }
            }
        });
        RadioGroup foodRadioGroup = findViewById(R.id.foodRadioGroup);

        foodRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.vegRadioButton:
                        handleFoodSelection("veg");
                        break;
                    case R.id.eatThemselvesRadioButton:
                        handleFoodSelection("eat themselves");
                        break;
                    case R.id.eatAssistanceRadioButton:
                        handleFoodSelection("need assistance while eating");
                        break;
                    case R.id.otherFoodRadioButton:
                        handleFoodSelection("other");
                        break;
                    default:
                        break;
                }
            }
        });

        RadioGroup dietaryRequirementsRadioGroup = findViewById(R.id.dietaryRequirementsRadioGroup);

        dietaryRequirementsRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.thickFluidRadioButton:
                        dietaryRequirementSelection("thickFluid");
                        break;
                    case R.id.normalFoodRadioButton:
                        dietaryRequirementSelection("normalFood");
                        break;
                    case R.id.thinFluidRadioButton:
                        dietaryRequirementSelection("thinFluid");
                        break;
                    case R.id.feedingTubeRadioButton:
                        dietaryRequirementSelection("feedingTube");
                        break;
                    case R.id.otherRadioButton:
                        dietaryRequirementSelection("other");
                        break;
                    default:
                        break;
                }
            }
        });

        EditText editText = findViewById(R.id.SendMessage);
        String userInput = editText.getText().toString();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("user_info");
        ref.child("message").setValue(userInput);


        Button submitButton = findViewById(R.id.submitFalseAlert);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameEditText = findViewById(R.id.nameEditText);
                String name = nameEditText.getText().toString();
                EditText locationEditText = findViewById(R.id.locationEditText);
                String location = locationEditText.getText().toString();
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference ref = database.getReference("false_alerts");
                String key = ref.push().getKey();
                ref.child(key).child("name").setValue(name);
                ref.child(key).child("location").setValue(location);
            }
        });

    }

}
