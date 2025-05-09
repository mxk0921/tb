package com.taobao.share.taopassword.busniess.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ALCreatePassWordModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COPY = "copy";
    public static final String ITEM = "item";
    public static final String OTHER = "other";
    public static final String Other = "other";
    public static final String QQ = "taopassword-qq";
    public static final String SHOP = "shop";
    public static final String WeiXin = "taopassword-weixin";

    /* renamed from: a  reason: collision with root package name */
    public String f11766a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum SourceType {
        ITEM,
        SHOP,
        Other;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SourceType sourceType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/taopassword/busniess/model/ALCreatePassWordModel$SourceType");
        }

        public static SourceType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SourceType) ipChange.ipc$dispatch("3af89e4", new Object[]{str});
            }
            return (SourceType) Enum.valueOf(SourceType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum Target {
        COPY,
        WeiXin,
        QQ,
        Other;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Target target, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/taopassword/busniess/model/ALCreatePassWordModel$Target");
        }

        public static Target valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Target) ipChange.ipc$dispatch("a0afa0c8", new Object[]{str});
            }
            return (Target) Enum.valueOf(Target.class, str);
        }
    }

    static {
        t2o.a(665845864);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        return this.f11766a;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c9c348", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }
}
