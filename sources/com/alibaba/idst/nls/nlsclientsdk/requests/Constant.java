package com.alibaba.idst.nls.nlsclientsdk.requests;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Constant {
    public static final String HEADER_TOKEN = "X-NLS-Token";
    public static final String PROP_APP_KEY = "appkey";
    public static final String PROP_ASR_CLASS_VOCABULARY = "class_vocabulary_id_map";
    public static final String PROP_ASR_CUSTOMIZATION_ID = "customization_id";
    public static final String PROP_ASR_ENABLE_DECODER_VAD = "enable_decoder_vad";
    public static final String PROP_ASR_ENABLE_ITN = "enable_inverse_text_normalization";
    public static final String PROP_ASR_ENABLE_VAD = "enable_voice_detection";
    public static final String PROP_ASR_FORMAT = "format";
    public static final String PROP_ASR_KEYWORD_LIST_ID = "keyword_list_id";
    public static final String PROP_ASR_MAX_ALTERNATES = "max_alternates";
    public static final String PROP_ASR_MAX_END_SILENCE = "max_end_silence";
    public static final String PROP_ASR_MAX_START_SILENCE = "max_start_silence";
    public static final String PROP_ASR_SAMPLE_RATE = "sample_rate";
    public static final String PROP_ASR_VOCABULARY = "vocabulary";
    public static final String PROP_ASR_VOCABULARY_ID = "vocabulary_id";
    public static final String PROP_MESSAGE_ID = "message_id";
    public static final String PROP_NAME = "name";
    public static final String PROP_NAMESPACE = "namespace";
    public static final String PROP_STATUS = "status";
    public static final String PROP_STATUS_TEXT = "status_text";
    public static final String PROP_TASK_ID = "task_id";
    public static final String PROP_TTS_FORMAT = "format";
    public static final String PROP_TTS_PITCH_RATE = "pitch_rate";
    public static final String PROP_TTS_SAMPLE_RATE = "sample_rate";
    public static final String PROP_TTS_SPEECH_RATE = "speech_rate";
    public static final String PROP_TTS_TEXT = "text";
    public static final String PROP_TTS_VOICE = "voice";
    public static final String PROP_TTS_VOLUME = "volume";
    public static final String PROP_VIRTUALASSISTANT_DIALOG_CONTEXT = "dialog_context";
    public static final String PROP_VIRTUALASSISTANT_DIALOG_PARAMS = "dialog_params";
    public static final String PROP_VIRTUALASSISTANT_ENABLE_GENDER_DETECTION = "enable_gender_detection";
    public static final String PROP_VIRTUALASSISTANT_ENABLE_VOICE_RECOGNITION = "enable_voice_recognition";
    public static final String PROP_VIRTUALASSISTANT_ENABLE_WAKE_WORD_VERIFICATION = "enable_wake_word_verification";
    public static final String PROP_VIRTUALASSISTANT_SESSION_ID = "session_id";
    public static final String PROP_VIRTUALASSISTANT_SPEECH_MODEL = "speech_model";
    public static final String PROP_VIRTUALASSISTANT_VOCABULARY = "vocabulary";
    public static final String PROP_VIRTUALASSISTANT_VPR_GROUP_ID = "voiceprint_group_id";
    public static final String PROP_VPR_GROUP_ID = "group_id";
    public static final String PROP_VPR_SERVICE_ID = "service_id";
    public static final String PROP_VPR_USER_ID = "user_id";
    public static final String PROP_WWV_MODEL_ID = "model_id";
    public static final String PROP_WWV_WAKE_WORD = "wake_word";
    public static final String VALUE_NAMESPACE_ASR = "SpeechRecognizer";
    public static final String VALUE_NAMESPACE_FLOWING_TTS = "FlowingSpeechSynthesizer";
    public static final String VALUE_NAMESPACE_LONG_TTS = "SpeechLongSynthesizer";
    public static final String VALUE_NAMESPACE_TTS = "SpeechSynthesizer";
    public static final String VALUE_NAMESPACE_VIRTUALASSISTANT = "VirtualAssistant";
    public static final String VALUE_NAMESPACE_VPR = "VoiceprintRecognizer";
    public static final String VALUE_NAMESPACE_WWV = "WakeWordVerifier";
    public static final String VALUE_NAME_ASR_COMPLETE = "RecognitionCompleted";
    public static final String VALUE_NAME_ASR_RESULT_CHANGE = "RecognitionResultChanged";
    public static final String VALUE_NAME_ASR_START = "StartRecognition";
    public static final String VALUE_NAME_ASR_STARTED = "RecognitionStarted";
    public static final String VALUE_NAME_ASR_STOP = "StopRecognition";
    public static final String VALUE_NAME_TASK_COMPLETED = "TaskCompleted";
    public static final String VALUE_NAME_TASK_FAILE = "TaskFailed";
    public static final String VALUE_NAME_TTS_COMPLETE = "SynthesisCompleted";
    public static final String VALUE_NAME_TTS_RUN_SYNTHESIS = "RunSynthesis";
    public static final String VALUE_NAME_TTS_START = "StartSynthesis";
    public static final String VALUE_NAME_TTS_STARTED = "SynthesisStarted";
    public static final String VALUE_NAME_TTS_STOP_SYNTHESIS = "StopSynthesis";
    public static final String VALUE_NAME_VIRTUALASSISTANT_DIALOG_RESULT_GENERATED = "DialogResultGenerated";
    public static final String VALUE_NAME_VIRTUALASSISTANT_REC_COMPLETED = "RecognitionCompleted";
    public static final String VALUE_NAME_VIRTUALASSISTANT_REC_RESULT_CHANGED = "RecognitionResultChanged";
    public static final String VALUE_NAME_VIRTUALASSISTANT_STARTED = "TaskStarted";
    public static final String VALUE_NAME_VIRTUALASSISTANT_STOP_WWV = "StopWakeWordVerification";
    public static final String VALUE_NAME_VIRTUALASSISTANT_WWV_COMPLETED = "WakeWordVerificationCompleted";
    public static final String VALUE_NAME_VPR_DELETE = "Delete";
    public static final String VALUE_NAME_VPR_DELETED = "Deleted";
    public static final String VALUE_NAME_VPR_REC_COMPLETED = "RecognitionCompleted";
    public static final String VALUE_NAME_VPR_REC_START = "StartRecognition";
    public static final String VALUE_NAME_VPR_REC_STARTED = "RecognitionStarted";
    public static final String VALUE_NAME_VPR_REC_STOP = "StopRecognition";
    public static final String VALUE_NAME_VPR_REG_COMPLETED = "RegistrationCompleted";
    public static final String VALUE_NAME_VPR_REG_START = "StartRegistration";
    public static final String VALUE_NAME_VPR_REG_STARTED = "RegistrationStarted";
    public static final String VALUE_NAME_VPR_REG_STOP = "StopRegistration";
    public static final String VALUE_NAME_WWV_COMPLETE = "VerificationCompleted";
    public static final String VALUE_NAME_WWV_START = "StartVerification";
    public static final String VALUE_NAME_WWV_STARTED = "VerificationStarted";
    public static final String VALUE_NAME_WWV_STOP = "StopVerification";
    public static final String VALUE_VIRTUALASSISTANT_CONTROL_JOB = "ControlJob";
    public static final String VALUE_VIRTUALASSISTANT_START_JOBS = "start_jobs";
    public static final String VALUE_VIRTUALASSISTANT_START_TASK = "StartTask";
    public static final String VALUE_VIRTUALASSISTANT_STOP_JOBS = "stop_jobs";
    public static final String VALUE_VIRTUALASSISTANT_STOP_TASK = "StopTask";

    static {
        t2o.a(199229444);
    }
}
