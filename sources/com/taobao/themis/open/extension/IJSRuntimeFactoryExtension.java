package com.taobao.themis.open.extension;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.s8c;
import tb.t2o;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IJSRuntimeFactoryExtension extends t4c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension$Type;", "", "(Ljava/lang/String;I)V", "Qking", "V8", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type Qking = new Type("Qking", 0);
        public static final Type V8 = new Type("V8", 1);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private static final /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("5de5e03d", new Object[0]) : new Type[]{Qking, V8};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/extension/IJSRuntimeFactoryExtension$Type");
        }

        public static Type valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("4cc8cde8", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Type.class, str);
            }
            return (Type) valueOf;
        }

        public static Type[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("40dc1619", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Type[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055251);
        }

        public static void a(IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("170f145a", new Object[]{iJSRuntimeFactoryExtension, bbsVar});
                return;
            }
            ckf.g(iJSRuntimeFactoryExtension, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(iJSRuntimeFactoryExtension, bbsVar);
        }

        public static void b(IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d6de5", new Object[]{iJSRuntimeFactoryExtension});
                return;
            }
            ckf.g(iJSRuntimeFactoryExtension, "this");
            t4c.a.b(iJSRuntimeFactoryExtension);
        }
    }

    void Z(Type type);

    s8c i0(ITMSPage iTMSPage);

    Type q();
}
