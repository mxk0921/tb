package com.taobao.tinct.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.tinct.impl.config.a;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OrangeChangeInfo extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_EXPIRE = 2;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_UPDATE = 1;
    @JSONField(name = pg1.ATOM_EXT_gray)
    public boolean isGray;
    @JSONField(deserialize = false, name = "used", serialize = false)
    public boolean isUsed;
    @JSONField(name = NotificationStyle.NOTIFICATION_STYLE)
    public String nameSpace;
    @JSONField(name = "status")
    public int status;
    @JSONField(name = MspDBHelper.RecordEntry.COLUMN_NAME_VERSION)
    public String version;

    public OrangeChangeInfo() {
        this(null, null);
    }

    public static OrangeChangeInfo builder(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("2558dffd", new Object[]{str, str2});
        }
        return new OrangeChangeInfo(str, str2);
    }

    public static /* synthetic */ Object ipc$super(OrangeChangeInfo orangeChangeInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tinct/model/OrangeChangeInfo");
    }

    public String getNameSpace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this});
        }
        return this.nameSpace;
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.status;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this});
        }
        String str = this.nameSpace;
        String str2 = this.version;
        return "o|" + str + "|" + str2;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.version;
    }

    @JSONField(serialize = false)
    public boolean isExpire() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f97d6f4", new Object[]{this})).booleanValue();
        }
        if (this.isGray) {
            j = a.h() + a.i();
        } else {
            j = a.h();
        }
        if (System.currentTimeMillis() - this.updateTime > j) {
            return true;
        }
        return false;
    }

    public boolean isGray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d71bccb8", new Object[]{this})).booleanValue();
        }
        return this.isGray;
    }

    public boolean isUsed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bffdf112", new Object[]{this})).booleanValue();
        }
        return this.isUsed;
    }

    public OrangeChangeInfo setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("566aab54", new Object[]{this, str});
        }
        this.bizName = str;
        return this;
    }

    public OrangeChangeInfo setGray(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("d269f7af", new Object[]{this, new Boolean(z)});
        }
        this.isGray = z;
        return this;
    }

    public OrangeChangeInfo setNameSpace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("669a6211", new Object[]{this, str});
        }
        this.nameSpace = str;
        return this;
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public void setUsed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5544d34e", new Object[]{this, new Boolean(z)});
        } else {
            this.isUsed = z;
        }
    }

    public OrangeChangeInfo setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("34ae2c6e", new Object[]{this, str});
        }
        this.version = str;
        return this;
    }

    public boolean update(OrangeChangeInfo orangeChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74c1fb8b", new Object[]{this, orangeChangeInfo})).booleanValue();
        }
        this.bizName = orangeChangeInfo.bizName;
        boolean z = this.isGray;
        boolean z2 = orangeChangeInfo.isGray;
        if (z == z2) {
            return false;
        }
        this.isGray = z2;
        this.updateTime = orangeChangeInfo.updateTime;
        this.status = 1;
        return true;
    }

    private OrangeChangeInfo(String str, String str2) {
        super(ChangeType.ORANGE);
        this.nameSpace = str;
        this.version = str2;
        this.isGray = false;
        this.status = 0;
        this.isUsed = false;
    }
}
