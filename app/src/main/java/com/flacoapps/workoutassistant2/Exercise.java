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
                    new Exercise ("Supine Biceps Curl", "Supine Biceps Curl", R.drawable.supine_biceps_curl),
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
