package com.alipay.mobile.common.logging.strategy;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogStrategyInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int SIMPLING_STATE_HIT = 1;
    public static int SIMPLING_STATE_INIT = -1;
    public static int SIMPLING_STATE_UNHIT;
    public boolean isEncrypt;
    public boolean isWrite;
    public boolean realtime;
    public int threshold;
    public boolean hasSendCondition = false;
    public boolean usemetds = false;
    public int level = -1;
    public int uploadRate = -1;
    public int uploadInterval = -1;
    public int levelRate1 = -1;
    public int levelRate2 = -1;
    public int levelRate3 = -1;
    public Map<String, Integer> levelHits = new ConcurrentHashMap();
    public List<String> sendCondition = new ArrayList();
    public List<String> uploadEvents = new ArrayList();

    public int getLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ca32f48", new Object[]{this})).intValue();
        }
        return this.level;
    }

    public int getLevelRate1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ca4c91d", new Object[]{this})).intValue();
        }
        return this.levelRate1;
    }

    public int getLevelRate2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cb2e09e", new Object[]{this})).intValue();
        }
        return this.levelRate2;
    }

    public int getLevelRate3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cc0f81f", new Object[]{this})).intValue();
        }
        return this.levelRate3;
    }

    public List<String> getSendCondition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c736103", new Object[]{this});
        }
        return this.sendCondition;
    }

    public int getThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ba8f7af", new Object[]{this})).intValue();
        }
        return this.threshold;
    }

    public List<String> getUploadEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7749ff0", new Object[]{this});
        }
        return this.uploadEvents;
    }

    public int getUploadInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0654956", new Object[]{this})).intValue();
        }
        return this.uploadInterval;
    }

    public int getUploadRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7e60f71", new Object[]{this})).intValue();
        }
        return this.uploadRate;
    }

    public boolean isEncrypt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0e398e6", new Object[]{this})).booleanValue();
        }
        return this.isEncrypt;
    }

    public boolean isHasSendCondition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b411c64e", new Object[]{this})).booleanValue();
        }
        return this.hasSendCondition;
    }

    public boolean isRealtime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec376c0", new Object[]{this})).booleanValue();
        }
        return this.realtime;
    }

    public boolean isUsemetds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60e0f719", new Object[]{this})).booleanValue();
        }
        return this.usemetds;
    }

    public boolean isWrite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f25816e0", new Object[]{this})).booleanValue();
        }
        return this.isWrite;
    }

    public void setEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202cd16a", new Object[]{this, new Boolean(z)});
        } else {
            this.isEncrypt = z;
        }
    }

    public void setHasSendCondition(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609a3992", new Object[]{this, new Boolean(z)});
        } else {
            this.hasSendCondition = z;
        }
    }

    public void setLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e77c5a", new Object[]{this, new Integer(i)});
        } else {
            this.level = i;
        }
    }

    public void setLevelRate1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ecb688d", new Object[]{this, new Integer(i)});
        } else {
            this.levelRate1 = i;
        }
    }

    public void setLevelRate2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a080412c", new Object[]{this, new Integer(i)});
        } else {
            this.levelRate2 = i;
        }
    }

    public void setLevelRate3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23519cb", new Object[]{this, new Integer(i)});
        } else {
            this.levelRate3 = i;
        }
    }

    public void setRealtime(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2df60", new Object[]{this, new Boolean(z)});
        } else {
            this.realtime = z;
        }
    }

    public void setSendCondition(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa97a29", new Object[]{this, list});
        } else {
            this.sendCondition = list;
        }
    }

    public void setThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216cdad3", new Object[]{this, new Integer(i)});
        } else {
            this.threshold = i;
        }
    }

    public void setUploadEvents(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4027174", new Object[]{this, list});
        } else {
            this.uploadEvents = list;
        }
    }

    public void setUploadInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a891574", new Object[]{this, new Integer(i)});
        } else {
            this.uploadInterval = i;
        }
    }

    public void setUploadRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb2ecb9", new Object[]{this, new Integer(i)});
        } else {
            this.uploadRate = i;
        }
    }

    public void setUsemetds(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a356a27", new Object[]{this, new Boolean(z)});
        } else {
            this.usemetds = z;
        }
    }

    public void setWrite(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a580b0", new Object[]{this, new Boolean(z)});
        } else {
            this.isWrite = z;
        }
    }
}
