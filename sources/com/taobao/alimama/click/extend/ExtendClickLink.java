package com.taobao.alimama.click.extend;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ExtendClickLink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f6177a;
    public final String b;
    public final CustomClickType c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum CustomClickType {
        CPM,
        CPC,
        NONE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CustomClickType customClickType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/click/extend/ExtendClickLink$CustomClickType");
        }

        public static CustomClickType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CustomClickType) ipChange.ipc$dispatch("40ec2447", new Object[]{str});
            }
            return (CustomClickType) Enum.valueOf(CustomClickType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6178a;
        public String b;
        public CustomClickType c;

        static {
            t2o.a(1017118751);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6edebdbb", new Object[]{aVar});
            }
            return aVar.f6178a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4f60859a", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ CustomClickType c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CustomClickType) ipChange.ipc$dispatch("86915a95", new Object[]{aVar});
            }
            return aVar.c;
        }

        public ExtendClickLink d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExtendClickLink) ipChange.ipc$dispatch("90132090", new Object[]{this});
            }
            return new ExtendClickLink(this);
        }

        public a e(CustomClickType customClickType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d18b2e2d", new Object[]{this, customClickType});
            }
            this.c = customClickType;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("af8de036", new Object[]{this, str});
            }
            this.f6178a = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a97d53e9", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(1017118749);
    }

    public ExtendClickLink(a aVar) {
        if (aVar != null) {
            this.f6177a = a.a(aVar);
            this.b = a.b(aVar);
            this.c = a.c(aVar);
        }
    }

    public CustomClickType a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomClickType) ipChange.ipc$dispatch("41d62941", new Object[]{this});
        }
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c4c1f30", new Object[]{this});
        }
        return this.f6177a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8196b7b", new Object[]{this});
        }
        return this.b;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0373ffd", new Object[]{this, str});
            return;
        }
        try {
            this.d = URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
