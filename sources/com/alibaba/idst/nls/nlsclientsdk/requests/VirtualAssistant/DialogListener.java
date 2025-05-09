package com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant;

import android.accounts.NetworkErrorException;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequest;
import com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener;
import com.alibaba.idst.nls.nlsclientsdk.util.TimeStampLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.t2o;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DialogListener implements ConnectionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SpeechVAListener";
    private DialogCallback innerCallback;
    private DialogRequest vaRequest;

    static {
        t2o.a(199229459);
        t2o.a(199229476);
    }

    public DialogListener(DialogRequest dialogRequest, DialogCallback dialogCallback) {
        this.vaRequest = dialogRequest;
        this.innerCallback = dialogCallback;
    }

    private boolean isDialogResultGenerated(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2009c097", new Object[]{this, dialogResponse})).booleanValue();
        }
        return dialogResponse.getName().equals(Constant.VALUE_NAME_VIRTUALASSISTANT_DIALOG_RESULT_GENERATED);
    }

    private boolean isRecComplete(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b022c076", new Object[]{this, dialogResponse})).booleanValue();
        }
        return dialogResponse.getName().equals("RecognitionCompleted");
    }

    private boolean isRecReady(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aeac54", new Object[]{this, dialogResponse})).booleanValue();
        }
        return dialogResponse.getName().equals(Constant.VALUE_NAME_VIRTUALASSISTANT_STARTED);
    }

    private boolean isRecResult(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e500da", new Object[]{this, dialogResponse})).booleanValue();
        }
        return dialogResponse.getName().equals("RecognitionResultChanged");
    }

    private boolean isTaskCompleted(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1e14153", new Object[]{this, dialogResponse})).booleanValue();
        }
        return dialogResponse.getName().equals(Constant.VALUE_NAME_TASK_COMPLETED);
    }

    private boolean isTaskFailed(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbd87f03", new Object[]{this, dialogResponse})).booleanValue();
        }
        return dialogResponse.getName().equals(Constant.VALUE_NAME_TASK_FAILE);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onClose(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fffa2ad", new Object[]{this, new Integer(i), str});
            return;
        }
        StringBuilder sb = new StringBuilder("connection is closed due to reason:");
        sb.append(str);
        sb.append(",code:");
        sb.append(i);
        this.vaRequest.setOnRequesting(false);
        this.innerCallback.onChannelClosed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onError(Exception exc) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "";
        }
        this.vaRequest.setOnRequesting(false);
        if (exc instanceof InterruptedException) {
            DialogCallback dialogCallback = this.innerCallback;
            dialogCallback.onTaskFailed("Connect Timeout : " + str, TaobaoMediaPlayer.FFP_PROP_FLOAT_PANO_FOV);
        } else if (exc instanceof NetworkErrorException) {
            DialogCallback dialogCallback2 = this.innerCallback;
            dialogCallback2.onTaskFailed("Connect Failed : " + str, TaobaoMediaPlayer.FFP_PROP_FLOAT_PANO_LATITUDE);
        } else {
            DialogCallback dialogCallback3 = this.innerCallback;
            dialogCallback3.onTaskFailed("Default Websocket Error : " + str, TaobaoMediaPlayer.FFP_PROP_INT64_PANO_TYPE);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            return;
        }
        Log.e(TAG, "fail status:{" + i + "},reason:{" + str + "}");
        this.vaRequest.setOnRequesting(false);
        this.innerCallback.onTaskFailed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
        } else if (str != null && str.trim().length() != 0) {
            StringBuilder sb = new StringBuilder("on message:{");
            sb.append(str);
            sb.append("}");
            DialogResponse dialogResponse = (DialogResponse) JSON.parseObject(str, DialogResponse.class);
            if (isRecReady(dialogResponse)) {
                DialogRequest.markReady();
                TimeStampLogUtil.getInstance();
                TimeStampLogUtil.printLog("time_stamp_onstarted", null, null);
                this.innerCallback.onTaskStarted();
            } else if (isRecResult(dialogResponse)) {
                TimeStampLogUtil.getInstance();
                TimeStampLogUtil.printLog("time_stamp_on_recognition_result_changed", null, dialogResponse.getRecognizedText());
                this.innerCallback.onRecognizedResultChanged(str);
            } else if (isRecComplete(dialogResponse)) {
                if (this.vaRequest.getJobsMode() == DialogRequest.JobsMode.ASR) {
                    DialogRequest.markComplete();
                    if (this.vaRequest.getEnableVoiceDetection()) {
                        this.vaRequest.stop();
                    }
                    this.innerCallback.onRecognizedCompleted(str);
                } else if (this.vaRequest.getJobsMode() == DialogRequest.JobsMode.ASR_DIALOGE) {
                    this.innerCallback.onRecognizedCompleted(str);
                    TimeStampLogUtil.getInstance();
                    TimeStampLogUtil.printLog("time_stamp_on_recognition_result_completed", null, dialogResponse.getRecognizedText());
                    if (this.vaRequest.getEnableVoiceDetection()) {
                        this.vaRequest.stop();
                    }
                }
            } else if (isDialogResultGenerated(dialogResponse)) {
                DialogRequest.markComplete();
                TimeStampLogUtil.getInstance();
                TimeStampLogUtil.printLog("time_stamp_on_dialog_result", null, null);
                this.innerCallback.onDialogResultGenerated(str);
            } else if (isTaskFailed(dialogResponse)) {
                DialogRequest.markComplete();
                onFail(dialogResponse.getStatus(), dialogResponse.getStatusText());
            } else if (isTaskCompleted(dialogResponse)) {
                this.vaRequest.close();
            } else {
                Log.e(TAG, str);
            }
        }
    }
}
