package tb;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.label.LabelContainer;
import com.taobao.android.label.LabelData;
import com.taobao.android.label.LabelStyle;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pne implements com.taobao.umipublish.extension.preview.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f26194a;
        public final /* synthetic */ LabelContainer b;
        public final /* synthetic */ PreviewModel.Media c;

        public a(pne pneVar, TUrlImageView tUrlImageView, LabelContainer labelContainer, PreviewModel.Media media) {
            this.f26194a = tUrlImageView;
            this.b = labelContainer;
            this.c = media;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                ViewGroup.LayoutParams layoutParams = this.f26194a.getLayoutParams();
                if (intrinsicWidth > 0 && intrinsicHeight > 0 && layoutParams != null && this.f26194a.getWidth() > 0 && this.f26194a.getHeight() > 0) {
                    float f = intrinsicHeight / intrinsicWidth;
                    if (f > this.f26194a.getHeight() / this.f26194a.getWidth()) {
                        layoutParams.width = (int) (this.f26194a.getHeight() / f);
                    } else {
                        layoutParams.height = (int) (f * this.f26194a.getWidth());
                    }
                }
                this.b.post(new RunnableC1031a());
            }
            return false;
        }

        /* compiled from: Taobao */
        /* renamed from: tb.pne$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC1031a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1031a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ArrayList<LabelData> arrayList = new ArrayList<>();
                    LabelStyle a2 = qfg.a();
                    Iterator<PreviewModel.Tag> it = a.this.c.tags.iterator();
                    while (it.hasNext()) {
                        PreviewModel.Tag next = it.next();
                        LabelData labelData = new LabelData();
                        labelData.posX = next.posX;
                        labelData.posY = next.posY;
                        labelData.labelStyle = a2;
                        labelData.content = next.tagName;
                        if (TextUtils.equals("left", next.direction)) {
                            labelData.direction = 0;
                        } else if (TextUtils.equals("right", next.direction)) {
                            labelData.direction = 1;
                        } else {
                            labelData.direction = krq.i(next.direction, 0);
                        }
                        arrayList.add(labelData);
                    }
                    a.this.b.enableMove(false);
                    a.this.b.enableRotate(false);
                    a.this.b.setLabelRegion(new Rect(0, 0, a.this.b.getWidth(), a.this.b.getHeight()));
                    a.this.b.setMarkList(arrayList);
                } catch (Exception e) {
                    UmiPublishMonitor.B("ImagePreviewItemCreator", "createView error" + e);
                }
            }
        }
    }

    static {
        t2o.a(944767036);
        t2o.a(944767023);
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public View a(ViewGroup viewGroup, PreviewModel.Media media) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d7c9742", new Object[]{this, viewGroup, media});
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lay_umi_image_preview_item, viewGroup, false);
        LabelContainer labelContainer = (LabelContainer) inflate.findViewById(R.id.fl_label_container);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.preview_image);
        tUrlImageView.setPhenixOptions(new PhenixOptions().bitmapProcessors(fgo.INSTANCE));
        if (media.path.startsWith("http")) {
            str = media.path;
        } else {
            str = uuo.q(media.path);
        }
        tUrlImageView.setImageUrl(str);
        tUrlImageView.succListener(new a(this, tUrlImageView, labelContainer, media));
        viewGroup.addView(inflate);
        inflate.setTag(media);
        return inflate;
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cff6db", new Object[]{this});
        }
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void c(View view, PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5551000a", new Object[]{this, view, media});
        }
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void destroyView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e93784c", new Object[]{this, view});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
