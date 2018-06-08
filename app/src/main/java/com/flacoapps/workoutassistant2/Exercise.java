package com.flacoapps.workoutassistant2;

public class Exercise {


    private String name;
    private String description;
    private int imageResourceId;

    //backMoves is an array of back exercises
    public static final Exercise[] backMoves =
            {
                    new Exercise ("Back Fly", "Back Fly", R.drawable.back_fly),
                    new Exercise ("Bend to Opposite Foot", "Bend to Opposite Foot", R.drawable.bend_to_opposite_foot),
                    new Exercise ("Bent Over Row", "Bent Over Row", R.drawable.bent_over_row),
                    new Exercise ("Dead Lift", "Dead Lift", R.drawable.dead_lift),
                    new Exercise ("Kneeling One Arm Row", "Kneeling One Arm Row", R.drawable.kneeling_one_arm_row),
                    new Exercise ("One Arm Row", "One Arm Row", R.drawable.one_arm_row),
                    new Exercise ("Twisting Bend to Opposite Foot", "Twisting Bend to Opposite Foot", R.drawable.twisting_bend_to_opposite_foot),
                    new Exercise ("Stiff-Legged Dead Lift", "Stiff-Legged Dead Lift", R.drawable.stiff_legged_dead_lift),
                    new Exercise ("Wide Row", "Wide Row", R.drawable.wide_row)
            };

    //absMoves is an array of abdominal exercises
    public static final Exercise[] absMoves =
            {
                    new Exercise ("Weighted Leg Raise", "Weighted Leg Raise", R.drawable.weighted_leg_raise),
                    new Exercise ("Dumbbell Side Bend", "Dumbbell Side Bend", R.drawable.dumbbell_side_bend),
                    new Exercise ("Weighted Crunch", "Weighted Crunch", R.drawable.weighted_crunch)
            };

    //bicepsMoves is an array of biceps exercises
    public static final Exercise[] bicepsMoves =
            {
                    new Exercise ("Alternating Biceps Curl", "Alternating Biceps Curl", R.drawable.alternating_biceps_curl),
                    new Exercise ("Bench Alternating Biceps Curl", "Bench Alternating Biceps Curl", R.drawable.bench_alternated_biceps_curl),
                    new Exercise ("Biceps Curl", "Biceps Curl", R.drawable.biceps_curl),
                    new Exercise ("Concentrated Biceps Curl", "Concentrated Biceps Curl", R.drawable.concentrated_biceps_curl),
                    new Exercise ("Hammer Curl", "Hammer Curl", R.drawable.hammer_curl),
                    new Exercise ("Incline Bench Biceps Curl", "Incline Bench Biceps Curl", R.drawable.incline_biceps_bench_curl),
                    new Exercise ("Inclined Biceps Curl", "Inclined Alternating Biceps Curl", R.drawable.incline_biceps_curl),
                    new Exercise ("Inclined Alternating Biceps Curl", "Inclined Alternating Biceps Curl", R.drawable.inclined_alternated_biceps_curl),
                    new Exercise ("Inner Biceps Curl", "Inner Biceps Curl", R.drawable.inner_biceps_curl),
                    new Exercise ("Palms-Forward Preacher Biceps Curl", "Palms-Forward Preacher Biceps Curl", R.drawable.palms_forward_preacher_biceps_curl),
                    new Exercise ("Palms-Neutral Preacher Biceps Curl", "Palms-Neutral Preacher Biceps Curl", R.drawable.palms_neutral_preacher_biceps_curl),
                    new Exercise ("Seated Alternating Biceps Curl", "Seated Alternating Biceps Curl", R.drawable.seated_alternated_biceps_curl),
                    new Exercise ("Seated Biceps Curl", "Seated Biceps Curl", R.drawable.seated_biceps_curl),
                    new Exercise ("Seated Concentrated Biceps Curl", "Seated Concentrated Biceps Curl", R.drawable.seated_concentrated_curl),
                    new Exercise ("Seated Inner Biceps Curl", "Seated Inner Biceps Curl", R.drawable.seated_inner_biceps_curl),
                    new Exercise ("Seated Isolated Curl", "Seated Isolated Curl", R.drawable.seated_isolated_curl),
                    new Exercise ("Supine Biceps Curl", "Supine Biceps Curl", R.drawable.supine_biceps_curl)
            };

    //tricepsMoves is an array of triceps exercises
    public static final Exercise[] tricepsMoves =
            {
                    new Exercise ("Bent-Over One-Arm Triceps Extension", "Bent-Over One-Arm Triceps Extension", R.drawable.bent_over_one_arm_triceps_extension),
                    new Exercise ("Lying Triceps Extension", "Lying Triceps Extension", R.drawable.lying_triceps_extension),
                    new Exercise ("One-Arm Triceps Extension", "One-Arm Triceps Extension", R.drawable.one_arm_triceps_extension),
                    new Exercise ("Seated Triceps Extension", "Seated Triceps Extension", R.drawable.seated_triceps_extension),
                    new Exercise ("Triceps Bench Press", "Triceps Bench Press", R.drawable.triceps_bench_press),
                    new Exercise ("Triceps Kickbacks", "Triceps Kickbacks", R.drawable.triceps_kickbacks),
                    new Exercise ("Two-arms Triceps Extension", "Two-arms Triceps Extension", R.drawable.two_arms_triceps_extension),
            };
            
    //shouldersMoves is an array of shoulders exercises
    public static final Exercise[] shouldersMoves =
            {
                    new Exercise ("Bent-Over Rear Deltoid Raise", "Bent-Over Rear Deltoid Raise", R.drawable.bent_over_rear_deltoid_raise),
                    new Exercise ("Bent-Over One-Arm Deltoid Raise", "Bent-Over One-Arm Deltoid Raise", R.drawable.bent_over_one_arm_deltoid_raise),
                    new Exercise ("Crouched Rear Deltoid Row", "Crouched Rear Deltoid Row", R.drawable.chrouched_rear_deltoid_row),
                    new Exercise ("Front Raise", "Front Raise", R.drawable.front_raise),
                    new Exercise ("Lateral Raise", "Lateral Raise", R.drawable.lateral_raise),
                    new Exercise ("Palms-In Shoulder Press", "Palms-In Shoulder Press", R.drawable.palms_in_shoulder_press),
                    new Exercise ("Push Press", "Push Press", R.drawable.push_press),
                    new Exercise ("Rear Deltoid Circle", "Rear Deltoid Circle", R.drawable.rear_deltoid_circle),
                    new Exercise ("Rear Deltoid Raise", "Rear Deltoid Raise", R.drawable.rear_deltoid_raise),
                    new Exercise ("Seated Shoulder Press", "Seated Shoulder Press", R.drawable.seated_shoulder_press),
                    new Exercise ("Seated Side Lateral Raise", "Seated Side Lateral Raise", R.drawable.seated_side_lateral_raise),
                    new Exercise ("Shoulder Press", "Shoulder Press", R.drawable.shoulder_press),
                    new Exercise ("Shoulder Shrug", "Shoulder Shrug", R.drawable.shoulder_shrug),
                    new Exercise ("Straight-Arm Front Deltoid Raise", "Straight-Arm Front Deltoid Raise", R.drawable.straight_arm_front_deltoid_raise),
                    new Exercise ("Upright Row", "Upright Row", R.drawable.upright_row)
            };

    //chestMoves is an array of chest exercises
    public static final Exercise[] chestMoves =
            {
                    new Exercise ("Bench Press", "Bench Press", R.drawable.bench_press),
                    new Exercise ("Bent-Arm Pullover", "Bent-Arm Pullover", R.drawable.bent_arm_pullover),
                    new Exercise ("Decline Bench Press", "Decline Bench Press", R.drawable.decline_bench_press),
                    //new Exercise ("Neutral-Grip Decline Bench Press", "Neutral-Grip Decline Bench Press", R.drawable.neutral_grip_decline_bench_press),
                    new Exercise ("Incline Bench Press", "Incline Bench Press", R.drawable.incline_bench_press),
                    new Exercise ("Incline Fly", "Incline Fly", R.drawable.incline_fly),
                    new Exercise ("Lying Fly", "Lying Fly", R.drawable.lying_fly),
                    new Exercise ("Neutral-Grip Incline Bench Press", "Neutral-Grip Incline Bench Press", R.drawable.neutral_grip_incline_bench_press),
                    new Exercise ("Neutral-Grip Bench Press", "Neutral-Grip Bench Press", R.drawable.neutral_grip_bench_press),
                    new Exercise ("Straight-Arm Pullover", "Straight-Arm Pullover", R.drawable.straight_arm_pullover),
            };

    //forearmsMoves is an array of forearms exercises
    public static final Exercise[] forearmsMoves =
            {
                    new Exercise ("One-Arm Palm-Down Wrist Curl", "One-Arm Palm-Down Wrist Curl", R.drawable.one_arm_palm_down_wrist_curl),
                    new Exercise ("One-Arm Palm-Up Wrist Curl", "Lying Triceps Extension", R.drawable.one_arm_palm_up_wrist_curl),
                    new Exercise ("Palms-Down Wrist Curl", "Palms-Down Wrist Curl", R.drawable.palms_down_wrist_curl),
                    new Exercise ("Palms-Up Wrist Curl", "Palms-Up Wrist Curl", R.drawable.palms_up_wrist_curl)
            };

    //legsMoves is an array of leg exercises
    public static final Exercise[] legsMoves =
            {
                    new Exercise ("Dumbbell Swing Through", "Dumbbell Swing Through", R.drawable.dumbbell_swing_through),
                    new Exercise ("One-Legged Toe Raise", "One-Legged Toe Raise", R.drawable.one_legged_toe_raise),
                    new Exercise ("Reverse Lunge", "Reverse Lunge", R.drawable.reverse_lunge),
                    new Exercise ("Seated One-Legged Toe Raise", "Seated One-Legged Toe Raise", R.drawable.seated_one_legged_toe_raise),
                    new Exercise ("Side Lunge", "Side Lunge", R.drawable.side_lunge),
                    new Exercise ("Squat", "Squat", R.drawable.squat),
                    new Exercise ("Stationary Lunge", "Stationary Lunge", R.drawable.stationary_lunge),
                    new Exercise ("Stiff-Legged Dead Lift", "Stiff-Legged Dead Lift", R.drawable.stiff_legged_dead_lift),
                    new Exercise ("Toe Raise", "Toe Raise", R.drawable.toe_raise)
            };

    //constructor used to set Drink object's properties
    private Exercise(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
