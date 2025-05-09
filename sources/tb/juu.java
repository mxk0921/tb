package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class juu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705167);
    }

    public static boolean a(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5adfe6ea", new Object[]{iUGCMedia})).booleanValue();
        }
        if (iUGCMedia == null || iUGCMedia.getImages() == null || iUGCMedia.getImages().size() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean b(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9a2ce36", new Object[]{iUGCMedia})).booleanValue();
        }
        if (!a(iUGCMedia) || c(iUGCMedia)) {
            return false;
        }
        return true;
    }

    public static boolean c(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ad9720a", new Object[]{iUGCMedia})).booleanValue();
        }
        if (iUGCMedia == null || iUGCMedia.getVideos() == null || iUGCMedia.getVideos().size() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean d(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bda1c956", new Object[]{iUGCMedia})).booleanValue();
        }
        if (!c(iUGCMedia) || a(iUGCMedia)) {
            return false;
        }
        return true;
    }

    public static boolean e(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c85dd44c", new Object[]{iUGCMedia})).booleanValue();
        }
        if (iUGCMedia == null) {
            return true;
        }
        if (a(iUGCMedia) || c(iUGCMedia)) {
            return false;
        }
        return true;
    }
}
