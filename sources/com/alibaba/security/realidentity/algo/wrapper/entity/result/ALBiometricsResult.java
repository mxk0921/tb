package com.alibaba.security.realidentity.algo.wrapper.entity.result;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ALBiometricsResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ALBiometricsResult";
    public static final long serialVersionUID = 1;
    public long beginTime;
    public String bh;
    public String collectedData;
    public DazzleCollectDataConfig dazzleDataConfigs;
    public String dazzleVideoOssUrl;
    public String dazzleVideoPath;
    public long endTime;
    public String failedVideoPath;
    public ABImageResult globalImage;
    public ABImageResult localImage;
    public ABImageResult originImage;
    public ABImageResult qualityImage;
    public String successfulVideoPath;
    public String videoHash;
    public String wukongData;
    public int biometricsResult = 0;
    public String version = "1.0";
    public int retryCount = 0;
    public List<ABActionResult> actionList = new ArrayList();
    public ABActionResult adjustAction = new ABActionResult();

    public void addActionResult(ABActionResult aBActionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a354d9", new Object[]{this, aBActionResult});
        } else {
            this.actionList.add(aBActionResult);
        }
    }

    public void addDazzleCollectConfigs(List<? extends DazzleDataConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a48bf6", new Object[]{this, list});
            return;
        }
        if (this.dazzleDataConfigs == null) {
            this.dazzleDataConfigs = new DazzleCollectDataConfig();
        }
        if (list != null) {
            for (DazzleDataConfigItem dazzleDataConfigItem : list) {
                this.dazzleDataConfigs.addUiConfig(dazzleDataConfigItem);
            }
        }
    }

    public String getBgDetectResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e3f175e", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.adjustAction.ecResult);
        for (ABActionResult aBActionResult : this.actionList) {
            stringBuffer.append(';');
            stringBuffer.append(aBActionResult.ecResult);
        }
        return stringBuffer.toString();
    }

    public void increaseRetryTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52e747a", new Object[]{this});
        } else {
            this.retryCount++;
        }
    }

    public void setDazzleCollectRotate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89af732f", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.dazzleDataConfigs == null) {
            this.dazzleDataConfigs = new DazzleCollectDataConfig();
        }
        this.dazzleDataConfigs.rotate = i;
    }

    public ALBiometricsResult setGlobalImage(ABImageResult aBImageResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ALBiometricsResult) ipChange.ipc$dispatch("bb885f03", new Object[]{this, aBImageResult});
        }
        this.globalImage = aBImageResult;
        return this;
    }

    public ALBiometricsResult setLocalImage(ABImageResult aBImageResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ALBiometricsResult) ipChange.ipc$dispatch("84f03bff", new Object[]{this, aBImageResult});
        }
        this.localImage = aBImageResult;
        return this;
    }

    public ALBiometricsResult setOriginImage(ABImageResult aBImageResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ALBiometricsResult) ipChange.ipc$dispatch("a131e960", new Object[]{this, aBImageResult});
        }
        this.originImage = aBImageResult;
        return this;
    }

    public void wipeRetryTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfb7295", new Object[]{this});
        } else {
            this.retryCount = 0;
        }
    }

    public String toJson() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0e2e4d6", new Object[]{this});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", 2);
            jSONObject.put("os", "android");
            jSONObject.put("r", this.biometricsResult);
            jSONObject.put("bt", this.beginTime);
            jSONObject.put("et", this.endTime);
            jSONObject.put("rt", this.retryCount);
            jSONObject.put("illuminance", -1.0d);
            Object obj = this.successfulVideoPath;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("videoS", obj);
            Object obj2 = this.failedVideoPath;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("videoF", obj2);
            ABImageResult aBImageResult = this.qualityImage;
            if (!(aBImageResult == null || aBImageResult.getLandmarks() == null)) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i2 = 0; i2 < this.qualityImage.getLandmarks().length; i2++) {
                    stringBuffer.append(this.qualityImage.getLandmarks()[i2]);
                    if (i2 < this.qualityImage.getLandmarks().length - 1) {
                        stringBuffer.append(",");
                    }
                }
                jSONObject.put("landmarks", stringBuffer.toString());
            }
            ABImageResult aBImageResult2 = this.qualityImage;
            if (!(aBImageResult2 == null || aBImageResult2.faceRect == null)) {
                StringBuffer stringBuffer2 = new StringBuffer();
                while (true) {
                    int[] iArr = this.qualityImage.faceRect;
                    if (i >= iArr.length) {
                        break;
                    }
                    stringBuffer2.append(iArr[i]);
                    if (i < this.qualityImage.faceRect.length - 1) {
                        stringBuffer2.append(",");
                    }
                    i++;
                }
                jSONObject.put("faceRect", stringBuffer2.toString());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
