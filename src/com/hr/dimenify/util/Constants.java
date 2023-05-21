package com.hr.dimenify.util;


public interface Constants {
    String SAVE_PREFIX = "com.hr.dimenify.";
    String MIGRATION_FLAG = "v2Tov3";
    String SAVE_PREFIX_V2 = "com.hr.dimenify.v2";
    String INIT_MODEL_JSON = "[{\"bucket\":\"mdpi\",\"directory\":\"values\",\"factorSp\":1.0,\"factorDp\":1.0,\"isSelected\":false,\"isMandatory\":true},{\"bucket\":\"hdpi\",\"directory\":\"values-hdpi\",\"factorSp\":1.2,\"factorDp\":1.2,\"isSelected\":false,\"isMandatory\":true},{\"bucket\":\"xhdpi\",\"directory\":\"values-xhdpi\",\"factorSp\":1.8,\"factorDp\":1.8,\"isSelected\":false,\"isMandatory\":true},{\"bucket\":\"xxhdpi\",\"directory\":\"values-xxhdpi\",\"factorSp\":2.4,\"factorDp\":2.4,\"isSelected\":false,\"isMandatory\":true},{\"bucket\":\"xxxhdpi\",\"directory\":\"values-xxxhdpi\",\"factorSp\":3.0,\"factorDp\":3.0,\"isSelected\":false,\"isMandatory\":true},{\"bucket\":\"sw240dp\",\"directory\":\"values-sw240dp\",\"factorSp\":0.8,\"factorDp\":0.8,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw330dp\",\"directory\":\"values-sw330dp\",\"factorSp\":1.1,\"factorDp\":1.1,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw360dp\",\"directory\":\"values-sw360dp\",\"factorSp\":1.2,\"factorDp\":1.2,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw390dp\",\"directory\":\"values-sw390dp\",\"factorSp\":1.3,\"factorDp\":1.3,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw420dp\",\"directory\":\"values-sw420dp\",\"factorSp\":1.4,\"factorDp\":1.4,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw450dp\",\"directory\":\"values-sw450dp\",\"factorSp\":1.5,\"factorDp\":1.5,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw480dp\",\"directory\":\"values-sw480dp\",\"factorSp\":1.6,\"factorDp\":1.6,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw510dp\",\"directory\":\"values-sw510dp\",\"factorSp\":1.7,\"factorDp\":1.7,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw300dp\",\"directory\":\"values-sw300dp\",\"factorSp\":1.0,\"factorDp\":1.0,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw570dp\",\"directory\":\"values-sw570dp\",\"factorSp\":1.9,\"factorDp\":1.9,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw660dp\",\"directory\":\"values-sw660dp\",\"factorSp\":2.2,\"factorDp\":2.2,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw960dp\",\"directory\":\"values-sw960dp\",\"factorSp\":2.7,\"factorDp\":2.7,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw1080dp\",\"directory\":\"values-sw1080dp\",\"factorSp\":3.2,\"factorDp\":3.2,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw240dp-land\",\"directory\":\"values-sw240dp-land\",\"factorSp\":0.8,\"factorDp\":0.8,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw330dp-land\",\"directory\":\"values-sw330dp-land\",\"factorSp\":1.1,\"factorDp\":1.1,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw360dp-land\",\"directory\":\"values-sw360dp-land\",\"factorSp\":1.2,\"factorDp\":1.2,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw390dp-land\",\"directory\":\"values-sw390dp-land\",\"factorSp\":1.25,\"factorDp\":1.25,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw420dp-land\",\"directory\":\"values-sw420dp-land\",\"factorSp\":1.3,\"factorDp\":1.3,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw450dp-land\",\"directory\":\"values-sw450dp-land\",\"factorSp\":1.33,\"factorDp\":1.33,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw480dp-land\",\"directory\":\"values-sw480dp-land\",\"factorSp\":1.36,\"factorDp\":1.36,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw510dp-land\",\"directory\":\"values-sw510dp-land\",\"factorSp\":1.39,\"factorDp\":1.39,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw300dp-land\",\"directory\":\"values-sw300dp-land\",\"factorSp\":1.0,\"factorDp\":1.0,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw570dp-land\",\"directory\":\"values-sw570dp-land\",\"factorSp\":1.41,\"factorDp\":1.41,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw660dp-land\",\"directory\":\"values-sw660dp-land\",\"factorSp\":1.6,\"factorDp\":1.6,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw960dp-land\",\"directory\":\"values-sw960dp-land\",\"factorSp\":2.3,\"factorDp\":2.3,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw1080dp-land\",\"directory\":\"values-sw1080dp-land\",\"factorSp\":2.5,\"factorDp\":2.5,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw200dp\",\"directory\":\"values-sw200dp\",\"factorSp\":0.7,\"factorDp\":0.7,\"isSelected\":true,\"isMandatory\":false},{\"bucket\":\"sw100dp\",\"directory\":\"values-sw100dp\",\"factorSp\":0.6,\"factorDp\":0.6,\"isSelected\":true,\"isMandatory\":false}]";
    String RESOURCES_TEXT = "<resources>\n</resources>";
    String RESOURCES_TAG = "resources";
    String DIMEN_TAG = "dimen";
    String MDPI = "mdpi";
    float TITLE_SIZE = 16.0f;
    String NAME_TAG = "name";
    String PLACEHOLDER_DIMEN = "\t<dimen name=\"{0}\">{1}{2}</dimen>\n";
    String FILE_NAME = "dimens.xml";
    String VALUES_PREFIX = "values-";
    String DP = "dp";
    String SP = "sp";
    String TITLE = "Set scale factors for ";
    String BULK_TITLE = "Your scaling factors are";
    String[] MESSAGES = {
            "There are duplicate buckets please fix before adding more."
            , "Custom buckets are restricted to 5"
            , "Could not map the resource folder to a density value"
            , "Could not convert the value into a number"
            , "Could not map xml the file to a density bucket. Please check if the source density bucket was exists."
    };
    int[] ERROR_CODE = {1, 2};
    String ERROR_TITLE = "Error";
    String SCALE_TEXT_PREFIX = "Please a scale value for ";
    String NEW_BUCKET = "Add new bucket";
    String METRIC = " metric";
    String DEFAULT_BUCKET = "sw600dp-land";
    float DEFAULT_SCALE_FACTOR = 1.2f;

}
