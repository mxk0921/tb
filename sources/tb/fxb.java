package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface fxb<VideoData, Video> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a<VideoData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final VideoData f19610a;

        static {
            t2o.a(444597089);
        }

        public a(VideoData videodata) {
            this.f19610a = videodata;
        }

        public VideoData a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoData) ipChange.ipc$dispatch("730d8cdc", new Object[]{this});
            }
            return this.f19610a;
        }
    }
}
