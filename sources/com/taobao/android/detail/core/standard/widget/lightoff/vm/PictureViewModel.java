package com.taobao.android.detail.core.standard.widget.lightoff.vm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import java.io.Serializable;
import tb.gkc;
import tb.mpe;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PictureViewModel implements ILightOffViewModel, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "PICTRUE";
    private TouchImageView mPhotoView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gkc f6594a;
        public final /* synthetic */ LightOffItemModel b;

        public a(PictureViewModel pictureViewModel, gkc gkcVar, LightOffItemModel lightOffItemModel) {
            this.f6594a = gkcVar;
            this.b = lightOffItemModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                gkc gkcVar = this.f6594a;
                if (gkcVar != null) {
                    gkcVar.d(this.b.originData, view);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gkc f6595a;
        public final /* synthetic */ LightOffItemModel b;

        public b(PictureViewModel pictureViewModel, gkc gkcVar, LightOffItemModel lightOffItemModel) {
            this.f6595a = gkcVar;
            this.b = lightOffItemModel;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            try {
                gkc gkcVar = this.f6595a;
                if (gkcVar != null) {
                    gkcVar.e(this.b.originData, view);
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    static {
        t2o.a(438304844);
        t2o.a(438304843);
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel
    public boolean allowPull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8a436b9", new Object[]{this})).booleanValue();
        }
        return true ^ this.mPhotoView.isScaled();
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel
    public Drawable createSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("995c4f3", new Object[]{this});
        }
        TouchImageView touchImageView = this.mPhotoView;
        if (touchImageView == null) {
            return null;
        }
        return touchImageView.getDrawable();
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return TYPE;
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel
    public View getView(Context context, LightOffItemModel lightOffItemModel, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ca8c19a9", new Object[]{this, context, lightOffItemModel, gkcVar});
        }
        if (!TYPE.equals(lightOffItemModel.type)) {
            return null;
        }
        TouchImageView touchImageView = new TouchImageView(context);
        this.mPhotoView = touchImageView;
        touchImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        mpe.m(this.mPhotoView, lightOffItemModel.url);
        this.mPhotoView.setOnClickListener(new a(this, gkcVar, lightOffItemModel));
        this.mPhotoView.setOnSinglePointLongClickListener(new b(this, gkcVar, lightOffItemModel));
        return this.mPhotoView;
    }
}
