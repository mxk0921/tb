package com.taobao.android.trade.provider;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.alibaba.android.imagecompat.AliImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.purchase.inject.Implementation;
import tb.cne;
import tb.s8d;
import tb.t2o;
import tb.zle;

/* compiled from: Taobao */
@Implementation
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImageProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String IMAGE_BINDER_SUFFIX = "END_IMAGE_URL";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(722468866);
            t2o.a(620757101);
        }

        public a(cne cneVar, AliImageView aliImageView, zle zleVar) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AliImageView f9687a;

        static {
            t2o.a(722468867);
            t2o.a(620757101);
        }

        public b(cne cneVar, AliImageView aliImageView, zle zleVar) {
            this.f9687a = aliImageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            BitmapDrawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (this.f9687a == null || (drawable = succPhenixEvent.getDrawable()) == null || drawable.getBitmap() == null || drawable.getBitmap().isRecycled()) {
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(722468865);
    }

    public void loadImage(String str, AliImageView aliImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9a2500", new Object[]{this, str, aliImageView});
        } else {
            aliImageView.setImageUrl(str);
        }
    }

    public void loadImage(String str, AliImageView aliImageView, cne cneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3848ea2a", new Object[]{this, str, aliImageView, cneVar});
        } else {
            loadImage(str, aliImageView, cneVar, null);
        }
    }

    public void loadImage(String str, AliImageView aliImageView, cne cneVar, zle zleVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cdd49b", new Object[]{this, str, aliImageView, cneVar, zleVar});
        } else if (aliImageView != null) {
            if (TextUtils.isEmpty(str)) {
                aliImageView.setImageDrawable(null);
                return;
            }
            aliImageView.succListener(new b(cneVar, aliImageView, zleVar));
            aliImageView.failListener(new a(cneVar, aliImageView, zleVar));
            throw new IllegalArgumentException("option is invalid");
        }
    }
}
