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
                    new Exercise ("Bent-Over One-Arm Triceps Extension", "Sit down, crouch forward and hold one dumbbell with one hand, elbow at a 90 degree angle, palm facing your body.\n" +
                            "\n" +
                            "Raise the dumbbell with one hand until your arm is parallel to the ground.\n" +
                            "\n" +
                            "Slowly lower it back after a short pause. Alternate after a set.\n" +
                            "\n" +
                            "Keep your upper arm still throughout.\n", R.drawable.bent_over_one_arm_triceps_extension),
                    new Exercise ("Lying Triceps Extension", "Lie down on your back on a bench and hold a dumbbell in each hand, palms facing up, upper arms pointing the ceiling.\n" +
                            "\n" +
                            "Raise the dumbbells by extending your elbows.\n" +
                            "\n" +
                            "Allow them to slowly return after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your upper arms still throughout.\n", R.drawable.lying_triceps_extension),
                    new Exercise ("One-Arm Triceps Extension", "Stand up and hold one dumbbell with one hand behind your head, elbow at a 90 degree angle, upper arm straight up.\n" +
                            "\n" +
                            "Raise the dumbbell with one hand until your arm is close to being fully extended.\n" +
                            "\n" +
                            "Slowly lower it back after a short pause. Alternate after a set.\n" +
                            "\n" +
                            "Tip: Keep your upper arm still throughout.\n", R.drawable.one_arm_triceps_extension),
                    new Exercise ("Seated Triceps Extension", "Sit down and hold one dumbbell with both hands behind your head, elbows at 90 degree angles, upper arms straight up.\n" +
                            "\n" +
                            "Raise the dumbbell with both hands until your arms are close to being fully extended.\n" +
                            "\n" +
                            "Slowly lower it back after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your upper arms still throughout.\n", R.drawable.seated_triceps_extension),
                    new Exercise ("Triceps Bench Press", "Lie down on your back on a bench and hold the dumbbells on your sides just above your chest, palms facing each other.\n" +
                            "\n" +
                            "Push the dumbbells straight up until your arms are close to being fully extended.\n" +
                            "\n" +
                            "Slowly lower them back after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when pushing the dumbbells up and breathe out when lowering them back down.\n", R.drawable.triceps_bench_press),
                    new Exercise ("Triceps Kickbacks", "Put your knee and hand on a bench and grab a dumbbell with your other hand, palm facing your body, upper arm parallel to your body.\n" +
                            "\n" +
                            "Push the dumbbell back by extending your elbow.\n" +
                            "\n" +
                            "Allow it to slowly return after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your upper arm still throughout.\n", R.drawable.triceps_kickbacks),
                    new Exercise ("Two-arms Triceps Extension", "Stand up and hold one dumbbell with both hands behind your head, upper arms pointing straight up.\n" +
                            "\n" +
                            "Raise the dumbbell up by curling your elbows.\n" +
                            "\n" +
                            "Slowly lower it back after a short pause.\n" +
                            "\n" +
                            "Tip: Your upper arms should remain still throughout.\n", R.drawable.two_arms_triceps_extension),
            };
            
    //shouldersMoves is an array of shoulders exercises
    public static final Exercise[] shouldersMoves =
            {
                    new Exercise ("Bent-Over Rear Deltoid Raise", "Sit on one end of the bench and lower your body as to hold one dumbbell in each hand just below the floor.\n" +
                            "\n" +
                            "Raise both dumbbells to your sides until your arms are close to being parallel to the ground.\n" +
                            "\n" +
                            "Lower them back down slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Maintain the same small arch in your elbows throughout.\n", R.drawable.bent_over_rear_deltoid_raise),
                    new Exercise ("Bent-Over One-Arm Deltoid Raise", "Bend down and hold one dumbbell with one hand between your legs, knees slightly bent.\n" +
                            "\n" +
                            "Raise the dumbbell to your side until your arm is parallel to the ground.\n" +
                            "\n" +
                            "Lower it back down slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your back straight throughout.\n", R.drawable.bent_over_one_arm_deltoid_raise),
                    new Exercise ("Crouched Rear Deltoid Row", "Crouch by bending your hips and knees and hold one dumbbell with each hand close to your knees, palms facing backwards.\n" +
                            "\n" +
                            "Raise the dumbbells straight up until your elbows form a 90 degree angle.\n" +
                            "\n" +
                            "Lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Try to focus on only moving your arms during the exercise.\n", R.drawable.chrouched_rear_deltoid_row),
                    new Exercise ("Front Raise", "Stand up and hold one dumbbell with each hand in front of your thighs, palms facing your body.\n" +
                            "\n" +
                            "Raise the dumbbells forward then up until your arms are close to being parallel to the ground.\n" +
                            "\n" +
                            "Lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your arms extended throughout.\n", R.drawable.front_raise),
                    new Exercise ("Lateral Raise", "Stand up and hold one dumbbell with each hand in front of your hips, palms facing each other.\n" +
                            "\n" +
                            "Raise the dumbbells to your sides until your arms are close to being parallel to the ground.\n" +
                            "\n" +
                            "Lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Try to maintain the angles in your elbows still throughout.\n", R.drawable.lateral_raise),
                    new Exercise ("Palms-In Shoulder Press", "Stand up and hold two dumbbells at shoulder level, palms facing each other.\n" +
                            "\n" +
                            "Push the dumbbells straight up until your elbows come close to locking.\n" +
                            "\n" +
                            "Lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Be careful NOT to jerk your back in an effort to help you raise the dumbbells.\n", R.drawable.palms_in_shoulder_press),
                    new Exercise ("Push Press", "Stand up and hold two dumbbells just above your shoulders, palms facing each other, knees arched.\n" +
                            "\n" +
                            "Push the dumbbells straight up until your arms are close to locking.\n" +
                            "\n" +
                            "Lower them back down slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Breathe out when pushing up and breathe in when lowering back.\n", R.drawable.push_press),
                    new Exercise ("Rear Deltoid Circle", "Lie down on your chest on a bench and hold one dumbbell in each hand on each side of your hips, arms slightly arched.\n" +
                            "\n" +
                            "Bring both dumbbells forward until you can see both at the same time.\n" +
                            "\n" +
                            "Bring them backwards slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Maintain the same small arch in your elbows and keep both dumbbells at the same height from the floor throughout.\n", R.drawable.rear_deltoid_circle),
                    new Exercise ("Rear Deltoid Raise", "Lie down on a high bench (face down) and one dumbbell on each hand below your chest, arms slightly bent.\n" +
                            "\n" +
                            "Raise both dumbbells to your sides until your arms are close to being parallel to the ground.\n" +
                            "\n" +
                            "Lower them back down slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Maintain the same small arch in your elbows throughout.\n", R.drawable.rear_deltoid_raise),
                    new Exercise ("Seated Shoulder Press", "Sit on a bench and hold two dumbbells at shoulder level, palms facing forward.\n" +
                            "\n" +
                            "Push the dumbbells straight up until your elbows come close to locking.\n" +
                            "\n" +
                            "Lower them back down after a short pause.\n" +
                            "\n" +
                            "Tip: Be careful NOT to jerk your back in an effort to help you raise the dumbbells.\n", R.drawable.seated_shoulder_press),
                    new Exercise ("Seated Side Lateral Raise", "Sit on one end of the bench and hold one dumbbell with each hand down the side of your body.\n" +
                            "\n" +
                            "Raise both dumbbells sideways until your arms are parallel to the ground.\n" +
                            "\n" +
                            "Lower them back down slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your back straight throughout.\n", R.drawable.seated_side_lateral_raise),
                    new Exercise ("Shoulder Press", "Stand up and hold two dumbbells close to your shoulders, palms facing forward.\n" +
                            "\n" +
                            "Raise the dumbbells straight up until your elbows come close to locking.\n" +
                            "\n" +
                            "Lower them back after a short pause.\n" +
                            "\n" +
                            "Tip: Be careful NOT to jerk your back in an effort to help you raise the dumbbells.\n", R.drawable.shoulder_press),
                    new Exercise ("Shoulder Shrug", "Stand up and hold one dumbbell with each hand in front of your thighs, palms facing your body.\n" +
                            "\n" +
                            "Raise the dumbbells straight up by raising your shoulders.\n" +
                            "\n" +
                            "Lower them back after a short pause.\n" +
                            "\n" +
                            "Keep your arms extended throughout.\n", R.drawable.shoulder_shrug),
                    new Exercise ("Straight-Arm Front Deltoid Raise", "Stand up and hold one dumbbell in each hand in front of your thighs.\n" +
                            "\n" +
                            "Raise the dumbbells to your shoulder level and continue on to raising them up at arms’ length.\n" +
                            "\n" +
                            "Lower them back down slowly after a pause.\n" +
                            "\n" +
                            "Tip: Keep your arms extended throughout.\n", R.drawable.straight_arm_front_deltoid_raise),
                    new Exercise ("Upright Row", "Stand up and hold one dumbbell in each hand in front of your thighs.\n" +
                            "\n" +
                            "Raise both dumbbells until your arms are parallel to the ground.\n" +
                            "\n" +
                            "Lower them back down slowly after a short pause.\n" +
                            "\n" +
                            "Tip: Be careful NOT to jerk your back in an effort to help you raise the dumbbells.\n", R.drawable.upright_row)
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
                    new Exercise ("Dumbbell Swing Through", "Hold one dumbbell with both hands between your legs and crouch down until your knees are at 90 degree angles.\n" +
                            "\n" +
                            "Lift yourself to a standing position while bringing the dumbbell up above your head.\n" +
                            "\n" +
                            "Slowly return to starting position after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your back straight throughout.\n", R.drawable.dumbbell_swing_through),
                    new Exercise ("One-Legged Toe Raise", "Stand up on one foot on top of a small step and hold one dumbbell with one hand against the side of your body.\n" +
                            "\n" +
                            "Raise yourself by standing on your toes.\n" +
                            "\n" +
                            "Slowly lower yourself back down after a short pause.\n" +
                            "\n" +
                            "Alternate feet after your set.\n" +
                            "\n" +
                            "Tip: Make sure that only the calf muscles are exercising.\n", R.drawable.one_legged_toe_raise),
                    new Exercise ("Reverse Lunge", "Stand up and hold one dumbbell on each hand along the sides of your body, palms facing your body.\n" +
                            "\n" +
                            "Place a foot back and bend your knees in order to bring down your body until your knees form 90 degree angles.\n" +
                            "\n" +
                            "Raise yourself back up after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your upper body steady throughout.\n", R.drawable.reverse_lunge),
                    new Exercise ("Seated One-Legged Toe Raise", "Sit down on the bench, place the front of one of your feet on top of the step and hold a dumbbell with both hands on top of that foot’s thighs.\n" +
                            "\n" +
                            "Raise the dumbbell by standing on your toes.\n" +
                            "\n" +
                            "Slowly lower them back down after a short pause.\n" +
                            "\n" +
                            "Alternate feet after your set.\n" +
                            "\n" +
                            "Make sure that only the calf muscles are exercising.\n", R.drawable.seated_one_legged_toe_raise),
                    new Exercise ("Side Lunge", "Stand up and hold one dumbbell on each hand against the sides of your body, palms facing each other.\n" +
                            "\n" +
                            "Take a wide step sideways so that your knee shows a 90 degree angle.\n" +
                            "\n" +
                            "Slowly bring yourself back up after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your back straight throughout.\n", R.drawable.side_lunge),
                    new Exercise ("Squat", "Stand up and hold one dumbbell with both hands in front of your thighs.\n" +
                            "\n" +
                            "Lower your body by bending your knees until they form a 90 degree angle. \n" +
                            "\n" +
                            "Raise yourself back up after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your upper body steady throughout.\n", R.drawable.squat),
                    new Exercise ("Stationary Lunge", "Stand up with one foot in front, one foot back and hold one dumbbell on each hand along the sides of your body, palms facing each other.\n" +
                            "\n" +
                            "Lower yourself without moving your feet until your knees form 90 degree angles.\n" +
                            "\n" +
                            "Raise yourself back up after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your upper body steady throughout.\n", R.drawable.stationary_lunge),
                    new Exercise ("Stiff-Legged Dead Lift", "Stand up and hold one dumbbell in each hand against the sides of your body, palms facing each other.\n" +
                            "\n" +
                            "Lower the dumbbells by bending your hips forward.\n" +
                            "\n" +
                            "Raise yourself back up again after a short pause.\n" +
                            "\n" +
                            "Tip: Keep your back straight throughout.\n", R.drawable.stiff_legged_dead_lift),
                    new Exercise ("Toe Raise", "Stand up and hold one dumbbell in each hand against the sides of your body, palms facing each other.\n" +
                            "\n" +
                            "Lift your heels from the ground by pushing on your toes.\n" +
                            "\n" +
                            "Lower yourself back down after a short pause.\n" +
                            "\n" +
                            "Tip: Keep the rest of your body still throughout.\n", R.drawable.toe_raise)
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
