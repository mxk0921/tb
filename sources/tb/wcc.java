package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface wcc extends cfc {
    public static final arb HOMEPAGE_CONTAINER_TYPE = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements arb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.arb
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4a4bacea", new Object[]{this});
            }
            if (com.taobao.tao.topmultitab.service.controller.a.e()) {
                return z4a.NEW_FACE_PARENT_INTL.c;
            }
            return z4a.NEW_FACE_PARENT.c;
        }

        @Override // tb.arb
        public String getContainerId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
            }
            if (com.taobao.tao.topmultitab.service.controller.a.e()) {
                return z4a.NEW_FACE_PARENT_INTL.f32522a;
            }
            return z4a.NEW_FACE_PARENT.f32522a;
        }

        @Override // tb.arb
        public String getPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
            }
            if (com.taobao.tao.topmultitab.service.controller.a.e()) {
                return z4a.NEW_FACE_PARENT_INTL.b;
            }
            return z4a.NEW_FACE_PARENT.b;
        }
    }
}
