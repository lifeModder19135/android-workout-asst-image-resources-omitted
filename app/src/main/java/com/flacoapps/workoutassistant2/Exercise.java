package com.flacoapps.workoutassistant2;

public class Exercise {


    private String name;
    private String description;
    private int imageResourceId;

    //backMoves is an array of back exercises
    public static final Exercise[] backMoves =
            {
                    new Exercise ("Back Fly", "Lie down on your chest on the bench.\n" +
                            "\n" +
                            "Grab two dumbbells with your hands, elbows at 90 degree angles.\n" +
                            "\n" +
                            "Raise the dumbbells until your arms are parallel to the ground.\n" +
                            "\n" +
                            "Lower them back after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when pulling the dumbbells and breathe in when lowering them back.\n", R.drawable.back_fly),
                    new Exercise ("Bend to Opposite Foot", "Stand up, reach down and grab a dumbbell just above one of your feet with your opposite hand (knees slightly bent).\n" +
                            "\n" +
                            "Lift the dumbbell up until you are standing up.\n" +
                            "\n" +
                            "Lower it back after a short pause.\n" +
                            "\n" +
                            "Tip: Keep a slight arch in your knees throughout.\n", R.drawable.bend_to_opposite_foot),
                    new Exercise ("Bent Over Row", "Stand up and reach down in order to hold two dumbbells with both hands (knees slightly bent).\n" +
                            "\n" +
                            "Lift the dumbbells up until your upper arms are parallel to your body. \n" +
                            "\n" +
                            "Lower them back after a short pause.\n" +
                            "\n" +
                            "Tip: Try to keep your back straight throughout. Only the arm should move.\n", R.drawable.bent_over_row),
                    new Exercise ("Dead Lift", "Stand up and grab a dumbbell with each of your hands.\n" +
                            "\n" +
                            "Flex your knees and hips in order to lower the dumbbells straight down.\n" +
                            "\n" +
                            "Raise yourself back up after a short pause.\n" +
                            "\n" +
                            "Tip:Breathe in when lowering and breathe out when returning to starting position\n" +
                            "\n" +
                            "Notes:The dumbbell deadlift is one of the most efficient dumbbell back exercises \n" +
                            "that you can do. The reason, is that the dumbbell deadlift not only exercises \n" +
                            "the back but also most of the major muscle groups.\n", R.drawable.dead_lift),
                    new Exercise ("Kneeling One Arm Row", "Put your knee and hand on a bench.\n" +
                            "\n" +
                            "Grab a dumbbell with your other hand.\n" +
                            "\n" +
                            "Lift the dumbbell straight up without moving anything other than your arm.\n" +
                            "\n" +
                            "Lower it back down after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when raising the dumbbell and in when returning to starting position.\n", R.drawable.kneeling_one_arm_row),
                    new Exercise ("One Arm Row", "Position yourself bent forward in front of a bench while holding a dumbbell with one hand (arm extended).\n" +
                            "\n" +
                            "Lift the dumbbell up until your upper arm is parallel to your body.\n" +
                            "\n" +
                            "Lower it back after a short pause. \n" +
                            "\n" +
                            "Alternate hands when set is completed.\n" +
                            "\n" +
                            "Tip:Try to keep your back straight throughout. Only the arm should move.\n", R.drawable.one_arm_row),
                    new Exercise ("Twisting Bend to Opposite Foot", "Stand up, reach down and grab 2 dumbbells just above one of your feet with your hands (knees slightly bent).\n" +
                            "\n" +
                            "Lift the dumbbells up until you are standing up.\n" +
                            "\n" +
                            "Lower them back but to the other foot. Alternate sides.\n" +
                            "\n" +
                            "Tip: Keep a slight arch in your knees throughout.\n", R.drawable.twisting_bend_to_opposite_foot),
                    new Exercise ("Stiff-Legged Dead Lift", "Stand up and reach down in order to hold two dumbbells with both hands (knees slightly bent).\n" +
                            "\n" +
                            "Raise your upper body until you are standing and lower it back after a short pause.\n" +
                            "\n" +
                            "Tip: Try to keep your arms straight throughout by keeping the same small arch in your elbows.\n", R.drawable.stiff_legged_dead_lift),
                    new Exercise ("Wide Row", "Grab one dumbbell with each hand. \n" +
                            "\n" +
                            "Flex your knees and hips to bring yourself to a squatting position.\n" +
                            "\n" +
                            "Lift both dumbbells straight up without altering the angles at your knees and hips.\n" +
                            "\n" +
                            "Lower them back after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when lifting the dumbbells and breathe in when returning to starting position.\n", R.drawable.wide_row)
            };

    //absMoves is an array of abdominal exercises
    public static final Exercise[] absMoves =
            {
                    new Exercise ("Weighted Leg Raise", "Lie down with your back on the bench, hands gripping the sides of it and hold a dumbbell between your feet.\n" +
                            "\n" +
                            "Raise your legs up until they are perpendicular to the floor and lower them back after a short pause.\n" +
                            "\n" +
                            "Tip: Try to keep your legs extended by keeping your knees at the same angle.\n", R.drawable.weighted_leg_raise),
                    new Exercise ("Dumbbell Side Bend", "Hold a dumbbell with one hand along the side of your body.\n" +
                            "\n" +
                            "Tilt your upper body to the side that holds the dumbbell.\n" +
                            "\n" +
                            "Bring it back after a short pause. \n" +
                            "\n" +
                            "Complete your set and change sides.\n" +
                            "\n" +
                            "Tip: Be careful not to tilt your upper body too far sideways where it may be difficult to bring it back.\n", R.drawable.dumbbell_side_bend),
                    new Exercise ("Weighted Crunch", "Lie down on your back on a bench and hold a dumbbell on top of your chest.\n" +
                            "\n" +
                            "Raise your upper body until your shoulder blades no longer touch the bench\n" +
                            "\n" +
                            "Lower yourself back down after a short pause.\n" +
                            "\n" +
                            "TIP: To avoid pulling your neck with your hands,\n" +
                            "look straight up instead of looking at your knees.\n", R.drawable.weighted_crunch)
            };

    //bicepsMoves is an array of biceps exercises
    public static final Exercise[] bicepsMoves =
            {
                    new Exercise ("Alternating Biceps Curl", "Stand up and hold one dumbbell with each hand down the side of your body, palms facing each other.\n" +
                            "\n" +
                            "Raise one dumbbell until it reaches your shoulder’s height.\n" +
                            "\n" +
                            "While slowly lowering it back down after a short pause, start raising the other one.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.alternating_biceps_curl),
                    new Exercise ("Bench Alternating Biceps Curl", "Lie face down on a high bench and hold one dumbbell with each hand straight below your shoulders.\n" +
                            "\n" +
                            "Raise one dumbbell until it reaches your shoulder’s height.\n" +
                            "\n" +
                            "While slowly lowering it back down after a short pause, start raising the other one.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.bench_alternated_biceps_curl),
                    new Exercise ("Biceps Curl", "Stand up and hold one dumbbell with each hand down the side of your body, palms facing each other.\n" +
                            "\n" +
                            "Raise both dumbbells until they reach your shoulders’ height.\n" +
                            "\n" +
                            "Slowly lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights\n" +
                            "\n" +
                            "Notes: Of all the dumbbell exercises for biceps, the biceps curl is the most important to \n" +
                            "learn, as it is the foundation on which most of the other dumbbell biceps exercises are based. \n" +
                            "Learn and practice this biceps exercise first.\n", R.drawable.biceps_curl),
                    new Exercise ("Concentrated Biceps Curl", "Stand behind an inclined bench and rest one arm on the back support while holding a dumbbell, palm facing up.\n" +
                            "\n" +
                            "Raise the dumbbell up to your shoulder.\n" +
                            "\n" +
                            "Lower it back down after a short pause.\n" +
                            "\n" +
                            "Tip: Only your lower arm should move throughout the exercise.\n", R.drawable.concentrated_biceps_curl),
                    new Exercise ("Hammer Curl", "Grab one dumbbell in each hand along the sides of your body, palms facing your body.\n" +
                            "\n" +
                            "Raise both dumbbells by curling your elbows.\n" +
                            "\n" +
                            "Lower them down after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your upper arms still throughout.\n" +
                            "\n" +
                            "Notes: The dumbbell hammer curl is one of the most important dumbbell exercises for biceps and has many variations.\n", R.drawable.hammer_curl),
                    new Exercise ("Incline Bench Biceps Curl", "Sit down on an inclined bench and hold one dumbbell in each hand down the sides of your body, palms facing each other.\n" +
                            "\n" +
                            "Raise both dumbbells until they reach your shoulder levels.\n" +
                            "\n" +
                            "Lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.incline_biceps_bench_curl),
                    new Exercise ("Inclined Biceps Curl", "Sit down on an inclined bench and hold one dumbbell with each hand down, palms facing each other.\n" +
                            "\n" +
                            "Raise both dumbbells until they reach your shoulders’ height.\n" +
                            "\n" +
                            "Slowly lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.incline_biceps_curl),
                    new Exercise ("Inclined Alternating Biceps Curl", "Sit down on an inclined bench and hold one dumbbell with each hand down, palms facing each other.\n" +
                            "\n" +
                            "Raise one dumbbell until it reaches your shoulder’s height.\n" +
                            "\n" +
                            "While slowly lowering it back down after a short pause, start raising the other one.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.inclined_alternated_biceps_curl),
                    new Exercise ("Inner Biceps Curl", "Stand up and hold one dumbbell with each hand down the side of your body, palms facing each other.\n" +
                            "\n" +
                            "Raise both dumbbells until they reach your shoulders’ height.\n" +
                            "\n" +
                            "Slowly lower them down after a short pause.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.inner_biceps_curl),
                    new Exercise ("Palms-Forward Preacher Biceps Curl", "Place one upper arm against the arm pad the other at a 90 degree angle and grab one dumbbell on each hand, palms facing up.\n" +
                            "\n" +
                            "Raise the dumbbells alternatively until your forearms are parallel to the floor and lower them back down alternatively after a short pause.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.palms_forward_preacher_biceps_curl),
                    new Exercise ("Palms-Neutral Preacher Biceps Curl", "Place one upper arm against the arm pad the other at a 90 degree angle and grab one dumbbell on each hand, palms facing each other.\n" +
                            "\n" +
                            "Raise the dumbbells alternatively until your forearms are parallel to the floor and lower them back down alternatively after a short pause.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.palms_neutral_preacher_biceps_curl),
                    new Exercise ("Seated Alternating Biceps Curl", "Sit down on a bench and hold one dumbbell with each hand down the side of your body, palms facing each other.\n" +
                            "\n" +
                            "Raise one dumbbell until it reaches your shoulder’s height.\n" +
                            "\n" +
                            "While slowly lowering it back down after a short pause, start raising the other one.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.seated_alternated_biceps_curl),
                    new Exercise ("Seated Biceps Curl", "Sit down on a bench and hold one dumbbell with each hand down the side of your body, palms facing each other.\n" +
                            "\n" +
                            "Raise both dumbbells until they reach your shoulders’ height.\n" +
                            "\n" +
                            "Slowly lower them down after a short pause.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.seated_biceps_curl),
                    new Exercise ("Seated Concentrated Biceps Curl", "Sit on a bench, rest one arm against your thigh and hold a dumbbell with that hand down between your legs, palm facing the other leg.\n" +
                            "\n" +
                            "Raise the dumbbell until it reaches your shoulder.\n" +
                            "\n" +
                            "Slowly lower it back down after a short pause. Alternate after a set.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in en effort to help you lift the weight.\n", R.drawable.seated_concentrated_curl),
                    new Exercise ("Seated Inner Biceps Curl", "Sit down on a bench and hold one dumbbell with each hand down the side of your body, palms facing each other.\n" +
                            "\n" +
                            "Raise both dumbbells until they reach your shoulders’ height.\n" +
                            "\n" +
                            "Slowly lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weights.\n", R.drawable.seated_inner_biceps_curl),
                    new Exercise ("Seated Isolated Curl", "Sit on one end of the bench, hold one dumbbell with your hand and place that hand’s elbow (extended) against the front of your thigh.\n" +
                            "\n" +
                            "Raise one dumbbell until it reaches your shoulder’s height.\n" +
                            "\n" +
                            "Slowly lower it back down after a short pause. Alternate after a set.\n" +
                            "\n" +
                            "Tip: Try NOT to jerk your upper body in an effort to help you lift the weight.\n", R.drawable.seated_isolated_curl),
                    new Exercise ("Supine Biceps Curl", "Lie down on your back on a bench and hold one dumbbell on each hand on each side of the body, below body height, palms facing up.\n" +
                            "\n" +
                            "Raise the dumbbells until they reach your body’s height.\n" +
                            "\n" +
                            "Slowly lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when lifting and breathe in when lowering back.\n", R.drawable.supine_biceps_curl)
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
                    new Exercise ("Bench Press", "Lie down on your back on a bench and hold 2 dumbbells at chest level along your body, palms facing your feet.\n" +
                            "\n" +
                            "Raise the dumbbells straight up until your elbows are close to being locked.\n" +
                            "\n" +
                            "Lower them back slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when raising the dumbbells and breathe in when lowering them back.\n", R.drawable.bench_press),
                    new Exercise ("Bent-Arm Pullover", "Lie down on your back on one end of the bench and hold 2 dumbbells below your head level, elbows at 90 degree angles.\n" +
                            "\n" +
                            "Raise both dumbbells until they are next to your chest while maintaining a 90 degree angles in your elbows.\n" +
                            "\n" +
                            "Lower them back after a pause.\n" +
                            "\n" +
                            "Tip: Breathe out when raising the dumbbells and breathe in when lowering them back.\n", R.drawable.bent_arm_pullover),
                    new Exercise ("Decline Bench Press", "Lie down on your back on a decline bench and hold 2 dumbbells at chest level, palms facing forward.\n" +
                            "\n" +
                            "Raise the dumbbells straight up until your elbows are close to being locked.\n" +
                            "\n" +
                            "Lower them back slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when raising the dumbbells and breathe in when lowering them back\n", R.drawable.decline_bench_press),
                    new Exercise ("Neutral-Grip Decline Bench Press", "Lie down on your back on a decline bench and hold 2 dumbbells at chest level, palms neutral.\n" +
                            "\n" +
                            "Raise the dumbbells straight up until your elbows are close to being locked.\n" +
                            "\n" +
                            "Lower them back slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when raising the dumbbells and breathe in when lowering them back\n", R.drawable.neutral_grip_decline_bench_press),
                    new Exercise ("Incline Bench Press", "Lie down on your back on an inclined bench and hold 2 dumbbells at chest level along your body, palms facing forward.\n" +
                            "\n" +
                            "Raise the dumbbells straight up until your elbows are close to being locked.\n" +
                            "\n" +
                            "Lower them back slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when raising the dumbbells and breathe in when lowering them back.\n", R.drawable.incline_bench_press),
                    new Exercise ("Incline Fly", "Lie down on your back on an incline bench and grab one dumbbell with each hand at body height, elbows just slightly arched.\n" +
                            "\n" +
                            "Raise the dumbbells until they are side by side on top of you.\n" +
                            "\n" +
                            "Slowly lower them back after a short pause.\n" +
                            "\n" +
                            "Tip: Try to maintain the same angle in your elbows throughout.\n", R.drawable.incline_fly),
                    new Exercise ("Lying Fly", "Lie down on your back on the bench and grab one dumbbell with each hand at body height, elbows just slightly arched.\n" +
                            "\n" +
                            "Raise the dumbbells until they are side by side on top of you.\n" +
                            "\n" +
                            "Slowly lower them back after a short pause.\n" +
                            "\n" +
                            "Tip: Try to maintain the same angle in your elbows throughout.\n", R.drawable.lying_fly),
                    new Exercise ("Neutral-Grip Incline Bench Press", "Lie down on your back on an inclined bench and hold 2 dumbbells at chest level along your body, palms neutral.\n" +
                            "\n" +
                            "Raise the dumbbells straight up until your elbows are close to being locked.\n" +
                            "\n" +
                            "Lower them back slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when raising the dumbbells and breathe in when lowering them back.\n", R.drawable.neutral_grip_incline_bench_press),
                    new Exercise ("Neutral-Grip Bench Press", "Lie down on your back on a bench and hold 2 dumbbells at chest level along your body, palms facing each other.\n" +
                            "\n" +
                            "Raise the dumbbells straight up until your elbows are close to being locked.\n" +
                            "\n" +
                            "Lower them back slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when raising the dumbbells and breathe in when lowering them back.\n", R.drawable.neutral_grip_bench_press),
                    new Exercise ("Straight-Arm Pullover", "Lie down on your back on one end of the bench and hold one dumbbell with both hands above your chest area, arms extended.\n" +
                            "\n" +
                            "Raise the dumbbell straight up until your arms are perpendicular to the floor.\n" +
                            "\n" +
                            "Lower it back after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your arms extended throughout by keeping still the angle of your elbows.\n", R.drawable.straight_arm_pullover),
            };

    //forearmsMoves is an array of forearms exercises
    public static final Exercise[] forearmsMoves =
            {
                    new Exercise ("One-Arm Palm-Down Wrist Curl", "Sit on one end of a bench and hold one dumbbell with one hand, wrist against your knee, palm facing down.\n" +
                            "\n" +
                            "Raise one dumbbell up by raising only your hand.\n" +
                            "\n" +
                            "Slowly lower it back down after a short pause.\n" +
                            "\n" +
                            "Alternate hands after a set.\n" +
                            "\n" +
                            "Tip: Keep your arms still throughout.\n", R.drawable.one_arm_palm_down_wrist_curl),
                    new Exercise ("One-Arm Palm-Up Wrist Curl", "Sit on one end of a bench and hold one dumbbell with one hand, wrist against your knee, palm facing up.\n" +
                            "\n" +
                            "Raise one dumbbell up by raising only your hand.\n" +
                            "\n" +
                            "Slowly lower it back down after a short pause. \n" +
                            "\n" +
                            "Alternate hands after a set.\n" +
                            "\n" +
                            "Tip: Keep your arms still throughout.\n", R.drawable.one_arm_palm_up_wrist_curl),
                    new Exercise ("Palms-Down Wrist Curl", "Sit on one end of a bench and hold one dumbbell on each hand, wrists against your knees, palms facing down.\n" +
                            "\n" +
                            "Raise the dumbbells up by raising only your hands.\n" +
                            "\n" +
                            "Slowly lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your arms still throughout.\n", R.drawable.palms_down_wrist_curl),
                    new Exercise ("Palms-Up Wrist Curl", "Sit on one end of a bench and hold one dumbbell on each hand, wrists against your knees, palms facing up.\n" +
                            "\n" +
                            "Raise the dumbbells up by raising only your hands and slowly lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your arms still throughout.\n", R.drawable.palms_up_wrist_curl)
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
