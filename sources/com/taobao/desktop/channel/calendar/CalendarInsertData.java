package com.taobao.desktop.channel.calendar;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarInsertData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String buttonText;
    private String byDay;
    private String content;
    private String deepLink;
    private String freq;
    private String huaweiDesc;
    private String huaweiImportant;
    private String huaweiLink;
    private String huaweiType;
    private long keepTime;
    private long previousMinutes;
    private long reminderTime;
    private long repeatEnd;
    private String targetUrl;
    private String title;

    static {
        t2o.a(435159043);
    }

    public String getButtonText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62bd2aa4", new Object[]{this});
        }
        return this.buttonText;
    }

    public String getByDay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8e9ac4a", new Object[]{this});
        }
        return this.byDay;
    }

    public String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.content;
    }

    public String getDeepLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eb98bfd", new Object[]{this});
        }
        return this.deepLink;
    }

    public String getFreq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1359f0cb", new Object[]{this});
        }
        return this.freq;
    }

    public String getHuaweiDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b66f82ab", new Object[]{this});
        }
        return this.huaweiDesc;
    }

    public String getHuaweiImportant() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97030054", new Object[]{this});
        }
        return this.huaweiImportant;
    }

    public String getHuaweiLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("892dfce2", new Object[]{this});
        }
        return this.huaweiLink;
    }

    public String getHuaweiType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d80a25a2", new Object[]{this});
        }
        return this.huaweiType;
    }

    public long getKeepTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d4d75e3", new Object[]{this})).longValue();
        }
        return this.keepTime;
    }

    public long getPreviousMinutes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be1b332d", new Object[]{this})).longValue();
        }
        return this.previousMinutes;
    }

    public long getReminderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f49ea2d0", new Object[]{this})).longValue();
        }
        return this.reminderTime;
    }

    public long getRepeatEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c526da05", new Object[]{this})).longValue();
        }
        return this.repeatEnd;
    }

    public String getTargetUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        return this.targetUrl;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public void setButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd1b152", new Object[]{this, str});
        } else {
            this.buttonText = str;
        }
    }

    public void setByDay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12472d4", new Object[]{this, str});
        } else {
            this.byDay = str;
        }
    }

    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.content = str;
        }
    }

    public void setDeepLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33554e19", new Object[]{this, str});
        } else {
            this.deepLink = str;
        }
    }

    public void setFreq(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec63690b", new Object[]{this, str});
            return;
        }
        if (str != null) {
            str = str.toUpperCase();
        }
        this.freq = str;
    }

    public void setHuaweiDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6a5a2b", new Object[]{this, str});
        } else {
            this.huaweiDesc = str;
        }
    }

    public void setHuaweiImportant(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384df0a", new Object[]{this, str});
        } else {
            this.huaweiImportant = str;
        }
    }

    public void setHuaweiLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137b26d4", new Object[]{this, str});
        } else {
            this.huaweiLink = str;
        }
    }

    public void setHuaweiType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0241614", new Object[]{this, str});
        } else {
            this.huaweiType = str;
        }
    }

    public void setKeepTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f382529", new Object[]{this, new Long(j)});
        } else {
            this.keepTime = j;
        }
    }

    public void setPreviousMinutes(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9ed9b7", new Object[]{this, new Long(j)});
        } else {
            this.previousMinutes = j;
        }
    }

    public void setReminderTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acc3bdc", new Object[]{this, new Long(j)});
        } else {
            this.reminderTime = j;
        }
    }

    public void setRepeatEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ab46df", new Object[]{this, new Long(j)});
        } else {
            this.repeatEnd = j;
        }
    }

    public void setTargetUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb4056d", new Object[]{this, str});
        } else {
            this.targetUrl = str;
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }
}
