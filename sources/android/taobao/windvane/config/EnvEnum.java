package android.taobao.windvane.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum EnvEnum {
    ONLINE(0, "m"),
    PRE(1, "wapa"),
    DAILY(2, "waptest");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int key;
    private String value;

    EnvEnum(int i, String str) {
        this.key = i;
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(EnvEnum envEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/config/EnvEnum");
    }

    public static EnvEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnvEnum) ipChange.ipc$dispatch("e4241be7", new Object[]{str});
        }
        return (EnvEnum) Enum.valueOf(EnvEnum.class, str);
    }

    public int getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d201723", new Object[]{this})).intValue();
        }
        return this.key;
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }

    public void setKey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919ba2df", new Object[]{this, new Integer(i)});
        } else {
            this.key = i;
        }
    }

    public void setValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
        } else {
            this.value = str;
        }
    }
}
