package com.taobao.android.appdevtools.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import tb.cg4;
import tb.ckf;
import tb.gxi;
import tb.h2n;
import tb.t2o;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$Jr\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u001bR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\"R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010$¨\u00063"}, d2 = {"Lcom/taobao/android/appdevtools/core/model/Config;", "Ljava/io/Serializable;", "", "wsUrl", "appWsUrl", "pluginsWsUrl", "debugId", "injectScriptUrl", "debugType", "", "Ltb/h2n;", "proxySettings", "Ltb/gxi;", "mockSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ltb/h2n;[Ltb/gxi;)V", "", "isValid", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()[Ltb/h2n;", "component8", "()[Ltb/gxi;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ltb/h2n;[Ltb/gxi;)Lcom/taobao/android/appdevtools/core/model/Config;", "toString", "Ljava/lang/String;", "getWsUrl", "getAppWsUrl", "getPluginsWsUrl", "getDebugId", "getInjectScriptUrl", "getDebugType", "[Ltb/h2n;", "getProxySettings", "[Ltb/gxi;", "getMockSettings", "appdevtools-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class Config implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String appWsUrl;
    private final String debugId;
    private final String debugType;
    private final String injectScriptUrl;
    private final gxi[] mockSettings;
    private final String pluginsWsUrl;
    private final h2n[] proxySettings;
    private final String wsUrl;

    static {
        t2o.a(998244386);
    }

    public Config(String str, String str2, String str3, String str4, String str5, String str6, h2n[] h2nVarArr, gxi[] gxiVarArr) {
        ckf.g(str, "wsUrl");
        ckf.g(str2, "appWsUrl");
        ckf.g(str3, "pluginsWsUrl");
        ckf.g(str4, "debugId");
        ckf.g(str5, "injectScriptUrl");
        this.wsUrl = str;
        this.appWsUrl = str2;
        this.pluginsWsUrl = str3;
        this.debugId = str4;
        this.injectScriptUrl = str5;
        this.debugType = str6;
        this.proxySettings = h2nVarArr;
        this.mockSettings = gxiVarArr;
    }

    public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, String str4, String str5, String str6, h2n[] h2nVarArr, gxi[] gxiVarArr, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        h2n[] h2nVarArr2;
        gxi[] gxiVarArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("89863eea", new Object[]{config, str, str2, str3, str4, str5, str6, h2nVarArr, gxiVarArr, new Integer(i), obj});
        }
        if ((1 & i) != 0) {
            str7 = config.wsUrl;
        } else {
            str7 = str;
        }
        if ((2 & i) != 0) {
            str8 = config.appWsUrl;
        } else {
            str8 = str2;
        }
        if ((4 & i) != 0) {
            str9 = config.pluginsWsUrl;
        } else {
            str9 = str3;
        }
        if ((8 & i) != 0) {
            str10 = config.debugId;
        } else {
            str10 = str4;
        }
        if ((i & 16) != 0) {
            str11 = config.injectScriptUrl;
        } else {
            str11 = str5;
        }
        if ((i & 32) != 0) {
            str12 = config.debugType;
        } else {
            str12 = str6;
        }
        if ((i & 64) != 0) {
            h2nVarArr2 = config.proxySettings;
        } else {
            h2nVarArr2 = h2nVarArr;
        }
        if ((i & 128) != 0) {
            gxiVarArr2 = config.mockSettings;
        } else {
            gxiVarArr2 = gxiVarArr;
        }
        return config.copy(str7, str8, str9, str10, str11, str12, h2nVarArr2, gxiVarArr2);
    }

    public final String component1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dfa78a5", new Object[]{this});
        }
        return this.wsUrl;
    }

    public final String component2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4803344", new Object[]{this});
        }
        return this.appWsUrl;
    }

    public final String component3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b05ede3", new Object[]{this});
        }
        return this.pluginsWsUrl;
    }

    public final String component4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("118ba882", new Object[]{this});
        }
        return this.debugId;
    }

    public final String component5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98116321", new Object[]{this});
        }
        return this.injectScriptUrl;
    }

    public final String component6() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e971dc0", new Object[]{this});
        }
        return this.debugType;
    }

    public final h2n[] component7() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h2n[]) ipChange.ipc$dispatch("edda3e78", new Object[]{this});
        }
        return this.proxySettings;
    }

    public final gxi[] component8() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gxi[]) ipChange.ipc$dispatch("cca39d15", new Object[]{this});
        }
        return this.mockSettings;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!ckf.b(Config.class, cls)) {
            return false;
        }
        if (obj != null) {
            Config config = (Config) obj;
            h2n[] h2nVarArr = this.proxySettings;
            if (h2nVarArr != null) {
                h2n[] h2nVarArr2 = config.proxySettings;
                if (h2nVarArr2 == null || !Arrays.equals(h2nVarArr, h2nVarArr2)) {
                    return false;
                }
            } else if (config.proxySettings != null) {
                return false;
            }
            gxi[] gxiVarArr = this.mockSettings;
            if (gxiVarArr != null) {
                gxi[] gxiVarArr2 = config.mockSettings;
                if (gxiVarArr2 == null || !Arrays.equals(gxiVarArr, gxiVarArr2)) {
                    return false;
                }
            } else if (config.mockSettings != null) {
                return false;
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.appdevtools.core.model.Config");
    }

    public final String getAppWsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76907b31", new Object[]{this});
        }
        return this.appWsUrl;
    }

    public final String getDebugId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea0fab61", new Object[]{this});
        }
        return this.debugId;
    }

    public final String getDebugType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d8be5e2", new Object[]{this});
        }
        return this.debugType;
    }

    public final String getInjectScriptUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72166b3c", new Object[]{this});
        }
        return this.injectScriptUrl;
    }

    public final gxi[] getMockSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gxi[]) ipChange.ipc$dispatch("dfd19cad", new Object[]{this});
        }
        return this.mockSettings;
    }

    public final String getPluginsWsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d952f0", new Object[]{this});
        }
        return this.pluginsWsUrl;
    }

    public final h2n[] getProxySettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h2n[]) ipChange.ipc$dispatch("6b74c519", new Object[]{this});
        }
        return this.proxySettings;
    }

    public final String getWsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb36dfdc", new Object[]{this});
        }
        return this.wsUrl;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        h2n[] h2nVarArr = this.proxySettings;
        if (h2nVarArr == null) {
            i = 0;
        } else {
            i = Arrays.hashCode(h2nVarArr);
        }
        int i3 = i * 31;
        gxi[] gxiVarArr = this.mockSettings;
        if (gxiVarArr != null) {
            i2 = Arrays.hashCode(gxiVarArr);
        }
        return i3 + i2;
    }

    public final boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        List<String> a2 = cg4.a();
        if ((a2 instanceof Collection) && a2.isEmpty()) {
            return false;
        }
        for (String str : a2) {
            if (wsq.O(getInjectScriptUrl(), str, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Config(wsUrl=" + this.wsUrl + ", appWsUrl=" + this.appWsUrl + ", pluginsWsUrl=" + this.pluginsWsUrl + ", debugId=" + this.debugId + ", injectScriptUrl=" + this.injectScriptUrl + ", debugType=" + ((Object) this.debugType) + ", proxySettings=" + Arrays.toString(this.proxySettings) + ", mockSettings=" + Arrays.toString(this.mockSettings) + ')';
    }

    public final Config copy(String str, String str2, String str3, String str4, String str5, String str6, h2n[] h2nVarArr, gxi[] gxiVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("42a1e8d8", new Object[]{this, str, str2, str3, str4, str5, str6, h2nVarArr, gxiVarArr});
        }
        ckf.g(str, "wsUrl");
        ckf.g(str2, "appWsUrl");
        ckf.g(str3, "pluginsWsUrl");
        ckf.g(str4, "debugId");
        ckf.g(str5, "injectScriptUrl");
        return new Config(str, str2, str3, str4, str5, str6, h2nVarArr, gxiVarArr);
    }
}
