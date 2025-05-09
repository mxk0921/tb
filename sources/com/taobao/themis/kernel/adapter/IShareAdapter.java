package com.taobao.themis.kernel.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.ArrayList;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.n8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IShareAdapter extends n8s {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onCancel(String str);

        void onFail(String str);

        void onSuccess(String str);
    }

    void share(Context context, ITMSPage iTMSPage, b bVar, a aVar);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f13564a;
        public final String b;
        public String c;
        public String d;
        public String e;
        public Map<String, ? extends Object> f;
        public final Map<String, ? extends Object> g;
        public final ArrayList<String> h;

        static {
            t2o.a(839909482);
        }

        public b(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, ArrayList<String> arrayList) {
            ckf.g(str, "businessId");
            ckf.g(str2, "url");
            this.f13564a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = map;
            this.g = map2;
            this.h = arrayList;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
            }
            return this.f13564a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
            }
            return this.d;
        }

        public final Map<String, Object> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cd0258b2", new Object[]{this});
            }
            return this.g;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
            }
            return this.e;
        }

        public final ArrayList<String> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("c52637ad", new Object[]{this});
            }
            return this.h;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (ckf.b(this.f13564a, bVar.f13564a) && ckf.b(this.b, bVar.b) && ckf.b(this.c, bVar.c) && ckf.b(this.d, bVar.d) && ckf.b(this.e, bVar.e) && ckf.b(this.f, bVar.f) && ckf.b(this.g, bVar.g) && ckf.b(this.h, bVar.h)) {
                return true;
            }
            return false;
        }

        public final Map<String, Object> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5ed3e092", new Object[]{this});
            }
            return this.f;
        }

        public final String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
            }
            return this.c;
        }

        public final String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.b;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int hashCode = ((this.f13564a.hashCode() * 31) + this.b.hashCode()) * 31;
            String str = this.c;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i7 = (hashCode + i) * 31;
            String str2 = this.d;
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.hashCode();
            }
            int i8 = (i7 + i2) * 31;
            String str3 = this.e;
            if (str3 == null) {
                i3 = 0;
            } else {
                i3 = str3.hashCode();
            }
            int i9 = (i8 + i3) * 31;
            Map<String, ? extends Object> map = this.f;
            if (map == null) {
                i4 = 0;
            } else {
                i4 = map.hashCode();
            }
            int i10 = (i9 + i4) * 31;
            Map<String, ? extends Object> map2 = this.g;
            if (map2 == null) {
                i5 = 0;
            } else {
                i5 = map2.hashCode();
            }
            int i11 = (i10 + i5) * 31;
            ArrayList<String> arrayList = this.h;
            if (arrayList != null) {
                i6 = arrayList.hashCode();
            }
            return i11 + i6;
        }

        public final void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb9c4864", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public final void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public final void k(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6607d3c", new Object[]{this, map});
            } else {
                this.f = map;
            }
        }

        public final void l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ShareConfig(businessId=" + this.f13564a + ", url=" + this.b + ", title=" + ((Object) this.c) + ", desc=" + ((Object) this.d) + ", imageUrl=" + ((Object) this.e) + ", templateParams=" + this.f + ", extendParams=" + this.g + ", targets=" + this.h + ')';
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, Map map, Map map2, ArrayList arrayList, int i, a07 a07Var) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : map2, (i & 128) != 0 ? null : arrayList);
        }
    }
}
