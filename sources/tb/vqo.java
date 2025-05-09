package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.FileBean;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.VideoBean;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vqo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f30185a;
        public final /* synthetic */ Object b;

        public a(FragmentActivity fragmentActivity, Object obj) {
            this.f30185a = fragmentActivity;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vqo.a(this.f30185a, (IUGCMedia) this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f30186a;
        public final /* synthetic */ c b;

        public b(FragmentActivity fragmentActivity, c cVar) {
            this.f30186a = fragmentActivity;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e9g.d(this.f30186a, "sandbox_copy_loading");
            vqo.b(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void invoke();
    }

    static {
        t2o.a(511705649);
    }

    public static /* synthetic */ void a(FragmentActivity fragmentActivity, IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47599fde", new Object[]{fragmentActivity, iUGCMedia});
        } else {
            e(fragmentActivity, iUGCMedia);
        }
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d17122e", new Object[]{cVar});
        } else {
            c(cVar);
        }
    }

    public static void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a931045a", new Object[]{cVar});
        } else if (cVar != null) {
            cVar.invoke();
        }
    }

    public static void e(FragmentActivity fragmentActivity, IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1156b3", new Object[]{fragmentActivity, iUGCMedia});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (UGCImage uGCImage : iUGCMedia.getImages()) {
            ImageBean imageBean = uGCImage.origin;
            if (imageBean != null) {
                arrayList.add(imageBean);
            }
        }
        for (UGCVideo uGCVideo : iUGCMedia.getVideos()) {
            VideoBean videoBean = uGCVideo.raw;
            if (videoBean != null) {
                arrayList.add(videoBean);
            }
            VideoBean videoBean2 = uGCVideo.origin;
            if (videoBean2 != null) {
                arrayList.add(videoBean2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FileBean fileBean = (FileBean) it.next();
            if (fileBean instanceof ImageBean) {
                fileBean.copyToSandBox(fragmentActivity, i8g.f(fragmentActivity, fileBean.getFileSuffix()));
            } else {
                fileBean.copyToSandBox(fragmentActivity, i8g.j(fragmentActivity, fileBean.getFileSuffix()));
            }
        }
    }

    public static void d(FragmentActivity fragmentActivity, Intent intent, int i, Bundle bundle, c cVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d0210b", new Object[]{fragmentActivity, intent, new Integer(i), bundle, cVar});
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra(IWorkflowData.KEY);
        if (!(serializableExtra instanceof IUGCMedia) || intent.getData() == null) {
            c(cVar);
            return;
        }
        IUGCMedia iUGCMedia = (IUGCMedia) serializableExtra;
        String d = muu.d(iUGCMedia);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dag.c(d).e("IMAGE_EDIT_PATH"));
        arrayList.add(dag.c(d).e("VIDEO_EDIT_PATH"));
        arrayList.add(dag.c(d).e("PUBLISH_PATH"));
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (knv.i(Uri.parse((String) it.next()), intent.getData())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z && eag.E() && (iUGCMedia.getMeta("go_publish_page_confirm") instanceof Boolean) && ((Boolean) iUGCMedia.getMeta("go_publish_page_confirm")).booleanValue()) {
            odg.c("SandBoxCopier", "来自直接发布,Need copy");
            z = true;
        }
        if (!z) {
            odg.c("SandBoxCopier", "No Need copy");
            c(cVar);
            return;
        }
        e9g.k(fragmentActivity, "sandbox_copy_loading");
        trt.b(new a(fragmentActivity, serializableExtra), new b(fragmentActivity, cVar));
    }
}
