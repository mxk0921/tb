package com.taobao.android.detail2.core.framework.view.frameanim;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import java.lang.ref.WeakReference;
import tb.aqz;
import tb.k0z;
import tb.t2o;
import tb.tpz;
import tb.zpz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BKAnimBgFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private zpz animLogHandler;
    private Activity mActivity;
    private tpz mAnimCardInfo;
    private Context mContext;
    private StringBuilder mErrorMsgBuilder;
    private boolean mHasAddPageSnapToAnimParent;
    private View mItemWhiteHolderView;
    private ImageView mPageSnapBgView;
    public volatile ImageView mScaleImageView;

    static {
        t2o.a(352321974);
    }

    public BKAnimBgFrameLayout(Context context) {
        super(context);
        init(context);
    }

    private void addViewToParent(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2682683", new Object[]{this, view, new Integer(i)});
        } else {
            addView(view, i);
        }
    }

    private StringBuilder getErrorMsgStringBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("3f992ddd", new Object[]{this});
        }
        if (this.mErrorMsgBuilder == null) {
            this.mErrorMsgBuilder = new StringBuilder();
        }
        return this.mErrorMsgBuilder;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        }
    }

    public static /* synthetic */ Object ipc$super(BKAnimBgFrameLayout bKAnimBgFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/BKAnimBgFrameLayout");
    }

    public zpz getAnimLogHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpz) ipChange.ipc$dispatch("6c41a345", new Object[]{this});
        }
        return k0z.d(this.animLogHandler);
    }

    public View getItemWhiteHolderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9e8defa", new Object[]{this});
        }
        return this.mItemWhiteHolderView;
    }

    public ImageView getPageSnapBgView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("6a7699b0", new Object[]{this});
        }
        return this.mPageSnapBgView;
    }

    public ImageView getScaleImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("cf746efd", new Object[]{this});
        }
        return this.mScaleImageView;
    }

    public boolean initAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579f8f4c", new Object[]{this})).booleanValue();
        }
        Context context = getContext();
        this.mContext = context;
        this.mActivity = NewDetailMaskFrameLayout.getRealActivity(context);
        return true;
    }

    public void initItemWhiteHolderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69f5dbe", new Object[]{this});
            return;
        }
        View view = this.mItemWhiteHolderView;
        if (view != null) {
            view.setVisibility(0);
        } else if (this.mAnimCardInfo != null) {
            View view2 = new View(this.mContext);
            this.mItemWhiteHolderView = view2;
            view2.setBackgroundColor(-1);
            tpz tpzVar = this.mAnimCardInfo;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) tpzVar.d, (int) tpzVar.c);
            layoutParams.gravity = 51;
            tpz tpzVar2 = this.mAnimCardInfo;
            layoutParams.leftMargin = (int) tpzVar2.f28877a;
            layoutParams.topMargin = (int) tpzVar2.b;
            this.mItemWhiteHolderView.setLayoutParams(layoutParams);
            addViewToParent(this.mItemWhiteHolderView, this.mHasAddPageSnapToAnimParent ? 1 : 0);
        }
    }

    public void initScaleImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbf732d", new Object[]{this});
        } else if (this.mScaleImageView == null) {
            createScaleImageView();
        }
    }

    public void preparePageSnapShot(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9006d4e4", new Object[]{this, aqzVar});
        } else if (!aqzVar.h) {
            getAnimLogHandler().a(getAnimLogHandler().b(), "开关未打开:enablePageSnapshot-false，preparePageSnapShot 失败。", null);
        } else if (this.mActivity == null) {
            getAnimLogHandler().a(getAnimLogHandler().b(), "无Activity，preparePageSnapShot 失败。", null);
        } else {
            doPreparePageSnapShot(aqzVar);
        }
    }

    public boolean resetScaleImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c3439b0", new Object[]{this})).booleanValue();
        }
        ImageView imageView = this.mScaleImageView;
        if (imageView == null) {
            return false;
        }
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setVisibility(4);
        imageView.setTranslationX(0.0f);
        imageView.setTranslationY(0.0f);
        imageView.setAlpha(1.0f);
        return true;
    }

    public void setAnimCardInfo(tpz tpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ed1523", new Object[]{this, tpzVar});
        } else {
            this.mAnimCardInfo = tpzVar;
        }
    }

    public void setAnimLogHandler(zpz zpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67977d23", new Object[]{this, zpzVar});
        } else {
            this.animLogHandler = zpzVar;
        }
    }

    public void setScaleImageView(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb954f9", new Object[]{this, imageView});
        } else {
            this.mScaleImageView = imageView;
        }
    }

    private void addViewToParent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3013dc80", new Object[]{this, view});
        } else {
            addView(view);
        }
    }

    public BKAnimBgFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private boolean createScaleImageView() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a38d0c1d", new Object[]{this})).booleanValue();
        }
        Bitmap bitmap = null;
        if (this.mActivity == null || this.mContext == null || this.mAnimCardInfo == null) {
            zpz animLogHandler = getAnimLogHandler();
            String b = getAnimLogHandler().b();
            animLogHandler.a(b, "createScaleImageView 出错。mActivity:" + this.mActivity + " mContext:" + this.mContext, null);
            StringBuilder errorMsgStringBuilder = getErrorMsgStringBuilder();
            errorMsgStringBuilder.append("|act:");
            errorMsgStringBuilder.append(this.mActivity == null);
            errorMsgStringBuilder.append("ctx:");
            if (this.mContext != null) {
                z = false;
            }
            errorMsgStringBuilder.append(z);
            errorMsgStringBuilder.append(":pfl");
            return false;
        }
        ImageView imageView = new ImageView(this.mContext);
        tpz tpzVar = this.mAnimCardInfo;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) tpzVar.d, (int) tpzVar.c);
        layoutParams.gravity = 51;
        tpz tpzVar2 = this.mAnimCardInfo;
        layoutParams.leftMargin = (int) tpzVar2.f28877a;
        layoutParams.topMargin = (int) tpzVar2.b;
        imageView.setLayoutParams(layoutParams);
        addViewToParent(imageView);
        WeakReference<Bitmap> weakReference = this.mAnimCardInfo.e;
        if (weakReference != null) {
            Bitmap bitmap2 = weakReference.get();
            if (!bitmap2.isRecycled()) {
                bitmap = bitmap2;
            }
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        imageView.setVisibility(4);
        this.mScaleImageView = imageView;
        return true;
    }

    private void doPreparePageSnapShot(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8314c6d9", new Object[]{this, aqzVar});
        } else if (aqzVar == null) {
            getAnimLogHandler().a(getAnimLogHandler().b(), "无 trnAnimParams 参数，preparePageSnapShot 失败。", null);
        } else {
            BitmapBinder bitmapBinder = aqzVar.j;
            if (bitmapBinder == null) {
                getAnimLogHandler().a(getAnimLogHandler().b(), "Error:pageSnapShotError:doPreparePageSnapShot:二跳未收到截屏参数。", null);
                getErrorMsgStringBuilder().append("|pageBinderNotFind");
                return;
            }
            Bitmap bitmap = bitmapBinder.getBitmap();
            if (bitmap != null) {
                ImageView imageView = new ImageView(this.mContext);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageBitmap(bitmap);
                if (aqzVar.i) {
                    ((FrameLayout) this.mActivity.getWindow().getDecorView()).addView(imageView, 0);
                } else {
                    this.mHasAddPageSnapToAnimParent = true;
                    addViewToParent(imageView, 0);
                }
                this.mPageSnapBgView = imageView;
                getAnimLogHandler().a(getAnimLogHandler().b(), "Success:preparePageSnapShot pageSnapShotBitmap get success!", null);
                return;
            }
            getAnimLogHandler().a(getAnimLogHandler().b(), "Error::preparePageSnapShot iBinder.getBitmap is null!", null);
        }
    }

    public BKAnimBgFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
