package com.taobao.message.sp.framework.model;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleTarget implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INVALID_TARGET_TYPE = "-1";
    private static final long serialVersionUID = -6919461967497580385L;
    private String targetId;
    @JSONField(name = "type")
    private String targetType;

    static {
        t2o.a(552599681);
    }

    public SimpleTarget() {
    }

    public static SimpleTarget obtain(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("7563b22a", new Object[]{simpleTarget}) : simpleTarget == null ? new SimpleTarget(null, "-1") : new SimpleTarget(simpleTarget.getTargetId(), simpleTarget.getTargetType());
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SimpleTarget simpleTarget = (SimpleTarget) obj;
            if (!TextUtils.isEmpty(this.targetId)) {
                if (TextUtils.equals(this.targetId, simpleTarget.getTargetId())) {
                    if (!TextUtils.isEmpty(this.targetType)) {
                        return TextUtils.equals(this.targetType, simpleTarget.targetType);
                    }
                    return TextUtils.isEmpty(simpleTarget.targetType);
                }
            } else if (TextUtils.isEmpty(simpleTarget.getTargetId())) {
                if (!TextUtils.isEmpty(this.targetType)) {
                    return TextUtils.equals(this.targetType, simpleTarget.targetType);
                }
                return TextUtils.isEmpty(simpleTarget.targetType);
            }
        }
        return false;
    }

    public String getTargetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ee30c37", new Object[]{this});
        }
        return this.targetId;
    }

    public String getTargetType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b0a6938", new Object[]{this});
        }
        return this.targetType;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.targetId;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.targetType;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.targetId);
    }

    public void setTargetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385bd51f", new Object[]{this, str});
        } else {
            this.targetId = str;
        }
    }

    public void setTargetType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2c453e", new Object[]{this, str});
        } else {
            this.targetType = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Target{targetId='" + this.targetId + "', targetType=" + this.targetType + '}';
    }

    private SimpleTarget(String str, String str2) {
        this.targetId = str;
        this.targetType = str2;
    }

    public static SimpleTarget obtain(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("26fd03be", new Object[]{str}) : new SimpleTarget(str, "-1");
    }

    public static SimpleTarget obtain(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("f3deab34", new Object[]{str, str2}) : TextUtils.isEmpty(str) ? obtain(str2) : new SimpleTarget(str2, str);
    }
}
