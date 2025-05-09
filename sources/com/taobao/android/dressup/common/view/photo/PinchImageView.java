package com.taobao.android.dressup.common.view.photo;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.IconCompat;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import tb.a07;
import tb.bmv;
import tb.ckf;
import tb.gl4;
import tb.hij;
import tb.sc;
import tb.t2o;
import tb.tpu;
import tb.uzq;
import tb.zk4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 ¶\u00012\u00020\u00012\u00020\u0002:\u0015·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001l¾\u0001¿\u0001À\u0001B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0019\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010\u001aJ\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J/\u00105\u001a\u00020\u00182\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u000200H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010\u001aJ\u001f\u0010>\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010:J\u000f\u0010?\u001a\u00020\u0018H\u0002¢\u0006\u0004\b?\u0010\u001aJ\u0017\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020@H\u0017¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u00020\u00182\b\u0010A\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00182\b\u0010A\u001a\u0004\u0018\u00010D¢\u0006\u0004\bG\u0010FJ\u0019\u0010I\u001a\u00020\u00182\b\u0010A\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00182\b\u0010A\u001a\u0004\u0018\u00010K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\n¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020'¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020'2\u0006\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020'2\u0006\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010VJ\r\u0010X\u001a\u00020\u0018¢\u0006\u0004\bX\u0010\u001aJ\u000f\u0010Y\u001a\u00020'H\u0016¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\u00182\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\u00020\u00182\u0006\u0010_\u001a\u00020\u001b¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020\u00182\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\u00182\u0006\u0010g\u001a\u00020fH\u0014¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u00182\u0006\u0010g\u001a\u00020fH\u0014¢\u0006\u0004\bj\u0010iJ/\u0010o\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\n2\u0006\u0010n\u001a\u00020\nH\u0014¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020'2\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0004\bs\u0010tJ\r\u0010u\u001a\u00020\u0018¢\u0006\u0004\bu\u0010\u001aR\u0016\u0010v\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010wR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R'\u0010\u0089\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0089\u0001\u0010w\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b\u008c\u0001\u0010aR'\u0010\u008d\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u008d\u0001\u0010w\u001a\u0006\b\u008e\u0001\u0010\u008b\u0001\"\u0005\b\u008f\u0001\u0010aR\u0017\u0010\u0090\u0001\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010~R\u0019\u0010\u0093\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0094\u0001R\u0019\u0010\u0099\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R#\u0010\u009d\u0001\u001a\f\u0012\u0005\u0012\u00030\u009c\u0001\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R#\u0010\u009f\u0001\u001a\f\u0012\u0005\u0012\u00030\u009c\u0001\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R\u0019\u0010 \u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0094\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R \u0010¤\u0001\u001a\t\u0018\u00010£\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010¦\u0001\u001a\u0002008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010¨\u0001\u001a\u0002008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010§\u0001R\u0018\u0010©\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010wR \u0010«\u0001\u001a\t\u0018\u00010ª\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R \u0010®\u0001\u001a\t\u0018\u00010\u00ad\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010³\u0001\u001a\u00020'8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010ZR\u0016\u0010´\u0001\u001a\u00020'8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010ZR\u0013\u00105\u001a\u00020\u001b8F¢\u0006\b\u001a\u0006\bµ\u0001\u0010\u008b\u0001¨\u0006Á\u0001"}, d2 = {"Lcom/taobao/android/dressup/common/view/photo/PinchImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Ltb/uzq$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Matrix;", "inMatrix", "getInnerMatrix", "(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;", "Landroid/graphics/RectF;", "containerRect", "()Landroid/graphics/RectF;", "getCurrentImageMatrix", "rect", "getImageBound", "(Landroid/graphics/RectF;)Landroid/graphics/RectF;", "Ltb/xhv;", "dispatchOuterMatrixChanged", "()V", "", "innerScale", "outerScale", "calculateNextScale", "(FF)F", sc.initView, "Landroid/graphics/Path;", "genPath", "()Landroid/graphics/Path;", "setCornerRect", "xInDiff", "yInDiff", "", "scrollBy", "(FF)Z", "x1", "y1", "x2", "y2", "saveScaleContext", "(FFFF)V", "Landroid/graphics/PointF;", "scaleCenter", "scaleBase", "distance", "lineCenter", "scale", "(Landroid/graphics/PointF;FFLandroid/graphics/PointF;)V", "x", "y", "doubleTap", "(FF)V", "scaleEnd", "vx", "vy", "fling", "cancelAllAnimator", "Landroid/view/View$OnTouchListener;", "l", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Landroid/view/View$OnClickListener;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "setOnDoubleClickListener", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$k;", "setZoomListener", "(Lcom/taobao/android/dressup/common/view/photo/PinchImageView$k;)V", "mode", "setFitMode", "(I)V", "touchable", "setTouchable", "(Z)V", "direction", "canScrollHorizontally", "(I)Z", "canScrollVertically", DMComponent.RESET, "canBeSwiped", "()Z", "Landroid/graphics/drawable/BitmapDrawable;", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, "setTargetImageDrawable", "(Landroid/graphics/drawable/BitmapDrawable;)V", "maxZoom", "setMaxZoom", "(F)V", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "resumeScaleAnimation", hij.KEY_CORNER_RADIUS, UTConstant.Args.UT_SUCCESS_F, "mPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/Paint;", "mRectF", "Landroid/graphics/RectF;", "maxScale", "mOnClickListener", "Landroid/view/View$OnClickListener;", "mOnDoubleClickListener", "mOnLongClickListener", "Landroid/view/View$OnLongClickListener;", "mZoomListener", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$k;", "mOnTouchListener", "Landroid/view/View$OnTouchListener;", gl4.CONFIG_START_CORNER_RADIUS, "getStartCornerRadius", "()F", "setStartCornerRadius", gl4.CONFIG_END_CORNER_RADIUS, "getEndCornerRadius", "setEndCornerRadius", "mOuterMatrix", "Landroid/graphics/Matrix;", "mMask", "mPinchMode", TLogTracker.LEVEL_INFO, "", "mTempMatrix", "[F", "mFitMode", "mTouchable", "Z", "", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$g;", "mOuterMatrixChangedListeners", "Ljava/util/List;", "mOuterMatrixChangedListenersCopy", "mDispatchOuterMatrixChangedLock", "mInitScaleType", "Landroid/widget/ImageView$ScaleType;", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$c;", "mMaskAnimator", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$c;", "mLastMovePoint", "Landroid/graphics/PointF;", "mScaleCenter", "mScaleBase", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$i;", "mScaleAnimator", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$i;", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$b;", "mFlingAnimator", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$b;", "Landroid/view/GestureDetector;", "mGestureDetector", "Landroid/view/GestureDetector;", "isSwapping", "isReady", "getScale", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "c", "d", "e", "f", at.f, bmv.MSGTYPE_INTERVAL, at.j, at.k, "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PinchImageView extends AppCompatImageView implements uzq.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float FLING_DAMPING_FACTOR = 0.9f;
    public static final int MODE_CROP_CENTER = 1;
    public static final int MODE_FIT_CENTER = 0;
    public static final int PINCH_MODE_FREE = 0;
    public static final int PINCH_MODE_SCALE = 2;
    public static final int PINCH_MODE_SCROLL = 1;
    public static final int SCALE_ANIMATOR_DURATION = 200;
    public static final String TAG = "PinchImageView";
    private float cornerRadius;
    private float endCornerRadius;
    private int mDispatchOuterMatrixChangedLock;
    private int mFitMode;
    private b mFlingAnimator;
    private final GestureDetector mGestureDetector;
    private ImageView.ScaleType mInitScaleType;
    private final PointF mLastMovePoint;
    private RectF mMask;
    private c mMaskAnimator;
    private View.OnClickListener mOnClickListener;
    private View.OnClickListener mOnDoubleClickListener;
    private View.OnLongClickListener mOnLongClickListener;
    private View.OnTouchListener mOnTouchListener;
    private final Matrix mOuterMatrix;
    private List<? extends g> mOuterMatrixChangedListeners;
    private List<? extends g> mOuterMatrixChangedListenersCopy;
    private Paint mPaint;
    private Path mPath;
    private int mPinchMode;
    private RectF mRectF;
    private i mScaleAnimator;
    private float mScaleBase;
    private final PointF mScaleCenter;
    private final float[] mTempMatrix;
    private boolean mTouchable;
    private k mZoomListener;
    private float maxScale;
    private float startCornerRadius;
    public static final a Companion = new a(null);
    private static final Matrix IDENTITY_M = new Matrix();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552794);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/taobao/android/dressup/common/view/photo/PinchImageView$b;", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "", "vectorX", "vectorY", "<init>", "(Lcom/taobao/android/dressup/common/view/photo/PinchImageView;FF)V", "animation", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", "[F", "mVector", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public final class b extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final float[] f7580a;

        static {
            t2o.a(918552795);
        }

        public b(float f, float f2) {
            setFloatValues(0.0f, 1.0f);
            setDuration(1000000L);
            addUpdateListener(this);
            this.f7580a = new float[]{f, f2};
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/photo/PinchImageView$FlingAnimator");
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, "animation");
            PinchImageView pinchImageView = PinchImageView.this;
            float[] fArr = this.f7580a;
            boolean access$scrollBy = PinchImageView.access$scrollBy(pinchImageView, fArr[0], fArr[1]);
            float[] fArr2 = this.f7580a;
            float f = fArr2[0] * 0.9f;
            fArr2[0] = f;
            float f2 = fArr2[1] * 0.9f;
            fArr2[1] = f2;
            if (!access$scrollBy || d.INSTANCE.b(0.0f, 0.0f, f, f2) < 1.0f) {
                valueAnimator.cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        /* renamed from: a  reason: collision with root package name */
        public static final e f7582a = new e(16);
        public static final h b = new h(16);

        static {
            t2o.a(918552797);
        }

        public final float[] a(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("10e8d155", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)}) : new float[]{(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        }

        public final float b(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6fab0762", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).floatValue();
            }
            float f5 = f - f3;
            float f6 = f2 - f4;
            return (float) Math.sqrt((f5 * f5) + (f6 * f6));
        }

        public final float[] c(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("d246195f", new Object[]{this, matrix});
            }
            if (matrix == null) {
                return new float[2];
            }
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }

        public final float[] d(float[] fArr, Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("dcc5fb16", new Object[]{this, fArr, matrix});
            }
            if (fArr == null || matrix == null) {
                return new float[2];
            }
            float[] fArr2 = new float[2];
            Matrix f = f();
            matrix.invert(f);
            f.mapPoints(fArr2, fArr);
            e(f);
            return fArr2;
        }

        public final void e(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7499fcf9", new Object[]{this, matrix});
            } else {
                f7582a.a(matrix);
            }
        }

        public final Matrix f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("e93ea5fb", new Object[]{this});
            }
            return f7582a.d();
        }

        public final Matrix g(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("1a877859", new Object[]{this, matrix});
            }
            Matrix d = f7582a.d();
            if (matrix != null) {
                d.set(matrix);
            }
            return d;
        }

        public final void h(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e55f89d3", new Object[]{this, rectF});
            } else {
                b.a(rectF);
            }
        }

        public final RectF i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("5b3514d7", new Object[]{this});
            }
            return b.d();
        }

        public final RectF j(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("fadfecd7", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            }
            RectF d = b.d();
            d.set(f, f2, f3, f4);
            return d;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e extends f<Matrix> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552798);
        }

        public e(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/photo/PinchImageView$MatrixPool");
        }

        /* renamed from: e */
        public Matrix b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("2c3d7ae8", new Object[]{this});
            }
            return new Matrix();
        }

        /* renamed from: f */
        public Matrix c(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("f12fd2bd", new Object[]{this, matrix});
            }
            ckf.g(matrix, IconCompat.EXTRA_OBJ);
            matrix.reset();
            return matrix;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class f<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Queue<T> f7583a = new LinkedList();
        public final int b;

        static {
            t2o.a(918552799);
        }

        public f(int i) {
            this.b = i;
        }

        public final void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("974b8c60", new Object[]{this, t});
            } else if (t != null && ((LinkedList) this.f7583a).size() < this.b) {
                ((LinkedList) this.f7583a).offer(t);
            }
        }

        public abstract T b();

        public abstract T c(T t);

        public final T d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("3c800764", new Object[]{this});
            }
            if (((LinkedList) this.f7583a).size() == 0) {
                return b();
            }
            Object poll = ((LinkedList) this.f7583a).poll();
            ckf.d(poll);
            return c(poll);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface g {
        void a(PinchImageView pinchImageView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class h extends f<RectF> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552801);
        }

        public h(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/photo/PinchImageView$RectFPool");
        }

        /* renamed from: e */
        public RectF b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("5cbadd8b", new Object[]{this});
            }
            return new RectF();
        }

        /* renamed from: f */
        public RectF c(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("3074a24b", new Object[]{this, rectF});
            }
            ckf.g(rectF, IconCompat.EXTRA_OBJ);
            rectF.setEmpty();
            return rectF;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/taobao/android/dressup/common/view/photo/PinchImageView$i;", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/graphics/Matrix;", "start", "end", "", "duration", "<init>", "(Lcom/taobao/android/dressup/common/view/photo/PinchImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;J)V", "animation", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Landroid/animation/Animator;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "", "a", "[F", "mStart", TplMsg.VALUE_T_NATIVE_RETURN, "mEnd", "c", "mResult", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public final class i extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final float[] f7584a;
        private final float[] b;
        private final float[] c;
        public final /* synthetic */ PinchImageView d;

        static {
            t2o.a(918552802);
        }

        public i(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2) {
            this(pinchImageView, matrix, matrix2, 0L, 4, null);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/photo/PinchImageView$ScaleAnimator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            float f = d.INSTANCE.c(PinchImageView.access$getMOuterMatrix$p(this.d))[0];
            k access$getMZoomListener$p = PinchImageView.access$getMZoomListener$p(this.d);
            if (access$getMZoomListener$p != null) {
                access$getMZoomListener$p.a(f);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }

        public i(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2, long j) {
            ckf.g(matrix, "start");
            ckf.g(matrix2, "end");
            this.d = pinchImageView;
            float[] fArr = new float[9];
            this.f7584a = fArr;
            float[] fArr2 = new float[9];
            this.b = fArr2;
            this.c = new float[9];
            setFloatValues(0.0f, 1.0f);
            setDuration(j);
            addUpdateListener(this);
            matrix.getValues(fArr);
            matrix2.getValues(fArr2);
            addListener(this);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                for (int i = 0; i <= 8; i++) {
                    float[] fArr = this.c;
                    float f = this.f7584a[i];
                    fArr[i] = f + ((this.b[i] - f) * floatValue);
                }
                PinchImageView.access$getMOuterMatrix$p(this.d).setValues(this.c);
                PinchImageView.access$dispatchOuterMatrixChanged(this.d);
                this.d.invalidate();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        public /* synthetic */ i(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2, long j, int i, a07 a07Var) {
            this(pinchImageView, matrix, matrix2, (i & 4) != 0 ? 200 : j);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface k {
        void a(float f);

        void c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class l extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/photo/PinchImageView$mGestureDetector$1");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r1.isRunning() == false) goto L_0x0040;
         */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onDoubleTap(android.view.MotionEvent r6) {
            /*
                r5 = this;
                r0 = 1
                com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.l.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x001c
                java.lang.String r2 = "7a319393"
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r5
                r3[r0] = r6
                java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                return r6
            L_0x001c:
                java.lang.String r1 = "e"
                tb.ckf.g(r6, r1)
                com.taobao.android.dressup.common.view.photo.PinchImageView r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                int r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.access$getMPinchMode$p(r1)
                if (r1 != r0) goto L_0x004d
                com.taobao.android.dressup.common.view.photo.PinchImageView r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                com.taobao.android.dressup.common.view.photo.PinchImageView$i r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.access$getMScaleAnimator$p(r1)
                if (r1 == 0) goto L_0x0040
                com.taobao.android.dressup.common.view.photo.PinchImageView r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                com.taobao.android.dressup.common.view.photo.PinchImageView$i r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.access$getMScaleAnimator$p(r1)
                tb.ckf.d(r1)
                boolean r1 = r1.isRunning()
                if (r1 != 0) goto L_0x004d
            L_0x0040:
                com.taobao.android.dressup.common.view.photo.PinchImageView r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                float r2 = r6.getX()
                float r6 = r6.getY()
                com.taobao.android.dressup.common.view.photo.PinchImageView.access$doubleTap(r1, r2, r6)
            L_0x004d:
                com.taobao.android.dressup.common.view.photo.PinchImageView r6 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                android.view.View$OnClickListener r6 = com.taobao.android.dressup.common.view.photo.PinchImageView.access$getMOnDoubleClickListener$p(r6)
                if (r6 == 0) goto L_0x0063
                com.taobao.android.dressup.common.view.photo.PinchImageView r6 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                android.view.View$OnClickListener r6 = com.taobao.android.dressup.common.view.photo.PinchImageView.access$getMOnDoubleClickListener$p(r6)
                tb.ckf.d(r6)
                com.taobao.android.dressup.common.view.photo.PinchImageView r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                r6.onClick(r1)
            L_0x0063:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.view.photo.PinchImageView.l.onDoubleTap(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
            if (r5.isRunning() == false) goto L_0x0058;
         */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onFling(android.view.MotionEvent r5, android.view.MotionEvent r6, float r7, float r8) {
            /*
                r4 = this;
                r0 = 1
                com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.dressup.common.view.photo.PinchImageView.l.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x002f
                java.lang.Float r2 = new java.lang.Float
                r2.<init>(r7)
                java.lang.Float r7 = new java.lang.Float
                r7.<init>(r8)
                r8 = 5
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r3 = 0
                r8[r3] = r4
                r8[r0] = r5
                r5 = 2
                r8[r5] = r6
                r5 = 3
                r8[r5] = r2
                r5 = 4
                r8[r5] = r7
                java.lang.String r5 = "f2b37f32"
                java.lang.Object r5 = r1.ipc$dispatch(r5, r8)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                return r5
            L_0x002f:
                java.lang.String r1 = "e1"
                tb.ckf.g(r5, r1)
                java.lang.String r5 = "e2"
                tb.ckf.g(r6, r5)
                com.taobao.android.dressup.common.view.photo.PinchImageView r5 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                int r5 = com.taobao.android.dressup.common.view.photo.PinchImageView.access$getMPinchMode$p(r5)
                if (r5 != 0) goto L_0x005d
                com.taobao.android.dressup.common.view.photo.PinchImageView r5 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                com.taobao.android.dressup.common.view.photo.PinchImageView$i r5 = com.taobao.android.dressup.common.view.photo.PinchImageView.access$getMScaleAnimator$p(r5)
                if (r5 == 0) goto L_0x0058
                com.taobao.android.dressup.common.view.photo.PinchImageView r5 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                com.taobao.android.dressup.common.view.photo.PinchImageView$i r5 = com.taobao.android.dressup.common.view.photo.PinchImageView.access$getMScaleAnimator$p(r5)
                tb.ckf.d(r5)
                boolean r5 = r5.isRunning()
                if (r5 != 0) goto L_0x005d
            L_0x0058:
                com.taobao.android.dressup.common.view.photo.PinchImageView r5 = com.taobao.android.dressup.common.view.photo.PinchImageView.this
                com.taobao.android.dressup.common.view.photo.PinchImageView.access$fling(r5, r7, r8)
            L_0x005d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.view.photo.PinchImageView.l.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            ckf.g(motionEvent, "e");
            if (!PinchImageView.access$isSwapping$p(PinchImageView.this) && PinchImageView.access$getMOnLongClickListener$p(PinchImageView.this) != null) {
                View.OnLongClickListener access$getMOnLongClickListener$p = PinchImageView.access$getMOnLongClickListener$p(PinchImageView.this);
                ckf.d(access$getMOnLongClickListener$p);
                access$getMOnLongClickListener$p.onLongClick(PinchImageView.this);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            ckf.g(motionEvent, "e");
            if (PinchImageView.access$isSwapping$p(PinchImageView.this)) {
                return false;
            }
            if (PinchImageView.access$getMOnClickListener$p(PinchImageView.this) != null) {
                View.OnClickListener access$getMOnClickListener$p = PinchImageView.access$getMOnClickListener$p(PinchImageView.this);
                ckf.d(access$getMOnClickListener$p);
                access$getMOnClickListener$p.onClick(PinchImageView.this);
            }
            return true;
        }
    }

    static {
        t2o.a(918552793);
        t2o.a(918552810);
    }

    public PinchImageView(Context context) {
        super(context);
        this.maxScale = 10.0f;
        this.mOuterMatrix = new Matrix();
        this.mTempMatrix = new float[9];
        this.mLastMovePoint = new PointF();
        this.mScaleCenter = new PointF();
        this.mGestureDetector = new GestureDetector(getContext(), new l());
        initView();
    }

    public static final /* synthetic */ void access$dispatchOuterMatrixChanged(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c1028f", new Object[]{pinchImageView});
        } else {
            pinchImageView.dispatchOuterMatrixChanged();
        }
    }

    public static final /* synthetic */ void access$doubleTap(PinchImageView pinchImageView, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161da84f", new Object[]{pinchImageView, new Float(f2), new Float(f3)});
        } else {
            pinchImageView.doubleTap(f2, f3);
        }
    }

    public static final /* synthetic */ void access$fling(PinchImageView pinchImageView, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea8bcc5", new Object[]{pinchImageView, new Float(f2), new Float(f3)});
        } else {
            pinchImageView.fling(f2, f3);
        }
    }

    public static final /* synthetic */ RectF access$getMMask$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("9f83dd35", new Object[]{pinchImageView});
        }
        return pinchImageView.mMask;
    }

    public static final /* synthetic */ View.OnClickListener access$getMOnClickListener$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("c5be3078", new Object[]{pinchImageView});
        }
        return pinchImageView.mOnClickListener;
    }

    public static final /* synthetic */ View.OnClickListener access$getMOnDoubleClickListener$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("980931a9", new Object[]{pinchImageView});
        }
        return pinchImageView.mOnDoubleClickListener;
    }

    public static final /* synthetic */ View.OnLongClickListener access$getMOnLongClickListener$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("e1af0830", new Object[]{pinchImageView});
        }
        return pinchImageView.mOnLongClickListener;
    }

    public static final /* synthetic */ Matrix access$getMOuterMatrix$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("20de351c", new Object[]{pinchImageView});
        }
        return pinchImageView.mOuterMatrix;
    }

    public static final /* synthetic */ int access$getMPinchMode$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d642e342", new Object[]{pinchImageView})).intValue();
        }
        return pinchImageView.mPinchMode;
    }

    public static final /* synthetic */ i access$getMScaleAnimator$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("71d17f86", new Object[]{pinchImageView});
        }
        return pinchImageView.mScaleAnimator;
    }

    public static final /* synthetic */ k access$getMZoomListener$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("4011341c", new Object[]{pinchImageView});
        }
        return pinchImageView.mZoomListener;
    }

    public static final /* synthetic */ boolean access$isSwapping$p(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df45caea", new Object[]{pinchImageView})).booleanValue();
        }
        return pinchImageView.isSwapping();
    }

    public static final /* synthetic */ boolean access$scrollBy(PinchImageView pinchImageView, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("993602a1", new Object[]{pinchImageView, new Float(f2), new Float(f3)})).booleanValue();
        }
        return pinchImageView.scrollBy(f2, f3);
    }

    public static final /* synthetic */ void access$setMMask$p(PinchImageView pinchImageView, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8386f20f", new Object[]{pinchImageView, rectF});
        } else {
            pinchImageView.mMask = rectF;
        }
    }

    public static final /* synthetic */ void access$setMOnClickListener$p(PinchImageView pinchImageView, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f824f116", new Object[]{pinchImageView, onClickListener});
        } else {
            pinchImageView.mOnClickListener = onClickListener;
        }
    }

    public static final /* synthetic */ void access$setMOnDoubleClickListener$p(PinchImageView pinchImageView, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254bdd05", new Object[]{pinchImageView, onClickListener});
        } else {
            pinchImageView.mOnDoubleClickListener = onClickListener;
        }
    }

    public static final /* synthetic */ void access$setMOnLongClickListener$p(PinchImageView pinchImageView, View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277d4996", new Object[]{pinchImageView, onLongClickListener});
        } else {
            pinchImageView.mOnLongClickListener = onLongClickListener;
        }
    }

    public static final /* synthetic */ void access$setMPinchMode$p(PinchImageView pinchImageView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ca01a0", new Object[]{pinchImageView, new Integer(i2)});
        } else {
            pinchImageView.mPinchMode = i2;
        }
    }

    public static final /* synthetic */ void access$setMScaleAnimator$p(PinchImageView pinchImageView, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0a5cc", new Object[]{pinchImageView, iVar});
        } else {
            pinchImageView.mScaleAnimator = iVar;
        }
    }

    public static final /* synthetic */ void access$setMZoomListener$p(PinchImageView pinchImageView, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41be5a0", new Object[]{pinchImageView, kVar});
        } else {
            pinchImageView.mZoomListener = kVar;
        }
    }

    private final float calculateNextScale(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f027348", new Object[]{this, new Float(f2), new Float(f3)})).floatValue();
        }
        float f4 = this.maxScale;
        if (f3 * f2 < f4 - 1.0E-4f) {
            return f4;
        }
        return f2;
    }

    private final void cancelAllAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1742ce55", new Object[]{this});
            return;
        }
        i iVar = this.mScaleAnimator;
        if (iVar != null) {
            ckf.d(iVar);
            iVar.cancel();
            this.mScaleAnimator = null;
        }
        b bVar = this.mFlingAnimator;
        if (bVar != null) {
            ckf.d(bVar);
            bVar.cancel();
            this.mFlingAnimator = null;
        }
    }

    private final RectF containerRect() {
        int i2;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("23959fdb", new Object[]{this});
        }
        int i6 = this.mFitMode;
        if (i6 == 0) {
            return d.INSTANCE.j(0.0f, 0.0f, getWidth(), getHeight());
        }
        if (i6 != 1) {
            return d.INSTANCE.j(0.0f, 0.0f, getWidth(), getHeight());
        }
        Drawable drawable = getDrawable();
        ckf.f(drawable, "getDrawable()");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        Drawable drawable2 = getDrawable();
        ckf.f(drawable2, "getDrawable()");
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        int width = getWidth();
        int height = getHeight();
        float f2 = intrinsicWidth / intrinsicHeight;
        float f3 = width;
        float f4 = height;
        if (f2 > f3 / f4) {
            i3 = (int) (f4 * f2);
            i2 = height;
        } else {
            i2 = (int) (f3 / f2);
            i3 = width;
        }
        return d.INSTANCE.j((width - i3) / 2, (height - i2) / 2, i4 + i3, i5 + i2);
    }

    private final void dispatchOuterMatrixChanged() {
        List<? extends g> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c48899", new Object[]{this});
            return;
        }
        List<? extends g> list2 = this.mOuterMatrixChangedListeners;
        if (list2 != null) {
            this.mDispatchOuterMatrixChangedLock++;
            ckf.d(list2);
            for (g gVar : list2) {
                gVar.a(this);
            }
            int i2 = this.mDispatchOuterMatrixChangedLock - 1;
            this.mDispatchOuterMatrixChangedLock = i2;
            if (i2 == 0 && (list = this.mOuterMatrixChangedListenersCopy) != null) {
                this.mOuterMatrixChangedListeners = list;
                this.mOuterMatrixChangedListenersCopy = null;
            }
        }
    }

    private final void doubleTap(float f2, float f3) {
        Drawable drawable;
        Drawable drawable2;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68c0f59", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (isReady()) {
            d dVar = d.INSTANCE;
            Matrix f5 = dVar.f();
            getInnerMatrix(f5);
            float f6 = dVar.c(f5)[0];
            float f7 = dVar.c(this.mOuterMatrix)[0];
            float f8 = f6 * f7;
            float width = getWidth();
            float height = getHeight();
            float f9 = this.maxScale;
            float calculateNextScale = calculateNextScale(f6, f7);
            if (calculateNextScale <= f9) {
                f9 = calculateNextScale;
            }
            if (f9 >= f6) {
                f6 = f9;
            }
            Matrix g2 = dVar.g(this.mOuterMatrix);
            float f10 = f6 / f8;
            g2.postScale(f10, f10, f2, f3);
            float f11 = width / 2.0f;
            float f12 = height / 2.0f;
            g2.postTranslate(f11 - f2, f12 - f3);
            Matrix g3 = dVar.g(f5);
            g3.postConcat(g2);
            ckf.f(getDrawable(), "getDrawable()");
            ckf.f(getDrawable(), "getDrawable()");
            float f13 = 0.0f;
            RectF j2 = dVar.j(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            g3.mapRect(j2);
            float f14 = j2.right;
            float f15 = j2.left;
            if (f14 - f15 < width) {
                f4 = f11 - ((f14 + f15) / 2.0f);
            } else if (f15 > 0) {
                f4 = -f15;
            } else if (f14 < width) {
                f4 = width - f14;
            } else {
                f4 = 0.0f;
            }
            float f16 = j2.bottom;
            float f17 = j2.top;
            if (f16 - f17 < height) {
                f13 = f12 - ((f16 + f17) / 2.0f);
            } else if (f17 > 0) {
                f13 = -f17;
            } else if (f16 < height) {
                f13 = height - f16;
            }
            g2.postTranslate(f4, f13);
            cancelAllAnimator();
            i iVar = new i(this, this.mOuterMatrix, g2, 0L, 4, null);
            this.mScaleAnimator = iVar;
            iVar.start();
            dVar.h(j2);
            dVar.e(g3);
            dVar.e(g2);
            dVar.e(f5);
        }
    }

    private final void fling(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e630f23", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (isReady()) {
            cancelAllAnimator();
            b bVar = new b(f2 / 60.0f, f3 / 60.0f);
            this.mFlingAnimator = bVar;
            bVar.start();
        }
    }

    private final Path genPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("d520a3c4", new Object[]{this});
        }
        Path path = this.mPath;
        if (path != null) {
            path.reset();
            Path path2 = this.mPath;
            if (path2 != null) {
                RectF rectF = this.mRectF;
                if (rectF != null) {
                    float f2 = this.cornerRadius;
                    path2.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                    Path path3 = this.mPath;
                    if (path3 != null) {
                        return path3;
                    }
                    ckf.y("mPath");
                    throw null;
                }
                ckf.y("mRectF");
                throw null;
            }
            ckf.y("mPath");
            throw null;
        }
        ckf.y("mPath");
        throw null;
    }

    private final Matrix getCurrentImageMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("9b235d28", new Object[]{this, matrix});
        }
        Matrix innerMatrix = getInnerMatrix(matrix);
        innerMatrix.postConcat(this.mOuterMatrix);
        return innerMatrix;
    }

    private final RectF getImageBound(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("1074d256", new Object[]{this, rectF});
        }
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!isReady()) {
            return rectF;
        }
        d dVar = d.INSTANCE;
        Matrix f2 = dVar.f();
        getCurrentImageMatrix(f2);
        Drawable drawable = getDrawable();
        ckf.f(drawable, "getDrawable()");
        Drawable drawable2 = getDrawable();
        ckf.f(drawable2, "getDrawable()");
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        f2.mapRect(rectF);
        dVar.e(f2);
        return rectF;
    }

    private final Matrix getInnerMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("23b31d60", new Object[]{this, matrix});
        }
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (isReady()) {
            d dVar = d.INSTANCE;
            Drawable drawable = getDrawable();
            ckf.f(drawable, "getDrawable()");
            Drawable drawable2 = getDrawable();
            ckf.f(drawable2, "getDrawable()");
            RectF j2 = dVar.j(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            RectF containerRect = containerRect();
            matrix.setRectToRect(j2, containerRect, Matrix.ScaleToFit.CENTER);
            dVar.h(containerRect);
            dVar.h(j2);
        }
        return matrix;
    }

    public static /* synthetic */ Object ipc$super(PinchImageView pinchImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2009938103:
                super.setOnTouchListener((View.OnTouchListener) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 120759747:
                super.setScaleType((ImageView.ScaleType) objArr[0]);
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/photo/PinchImageView");
        }
    }

    private final boolean isReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
        }
        if (getDrawable() == null) {
            return false;
        }
        Drawable drawable = getDrawable();
        ckf.f(drawable, "getDrawable()");
        if (drawable.getIntrinsicWidth() <= 0) {
            return false;
        }
        Drawable drawable2 = getDrawable();
        ckf.f(drawable2, "getDrawable()");
        if (drawable2.getIntrinsicHeight() <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        return true;
    }

    private final void saveScaleContext(float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53ef629", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Float(f5)});
            return;
        }
        d dVar = d.INSTANCE;
        this.mScaleBase = dVar.c(this.mOuterMatrix)[0] / dVar.b(f2, f3, f4, f5);
        float[] d2 = dVar.d(dVar.a(f2, f3, f4, f5), this.mOuterMatrix);
        this.mScaleCenter.set(d2[0], d2[1]);
    }

    private final void scale(PointF pointF, float f2, float f3, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ecb5f1", new Object[]{this, pointF, new Float(f2), new Float(f3), pointF2});
        } else if (isReady()) {
            float f4 = f2 * f3;
            d dVar = d.INSTANCE;
            Matrix f5 = dVar.f();
            f5.postScale(f4, f4, pointF.x, pointF.y);
            f5.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
            this.mOuterMatrix.set(f5);
            dVar.e(f5);
            dispatchOuterMatrixChanged();
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void scaleEnd() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.view.photo.PinchImageView.scaleEnd():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean scrollBy(float r12, float r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dressup.common.view.photo.PinchImageView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0029
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r12)
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r13)
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r1] = r11
            r13[r0] = r3
            r0 = 2
            r13[r0] = r12
            java.lang.String r12 = "651fd3cf"
            java.lang.Object r12 = r2.ipc$dispatch(r12, r13)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L_0x0029:
            boolean r2 = r11.isReady()
            if (r2 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.taobao.android.dressup.common.view.photo.PinchImageView$d r2 = com.taobao.android.dressup.common.view.photo.PinchImageView.d.INSTANCE
            android.graphics.RectF r3 = r2.i()
            r11.getImageBound(r3)
            int r4 = r11.getWidth()
            float r4 = (float) r4
            int r5 = r11.getHeight()
            float r5 = (float) r5
            float r6 = r3.right
            float r7 = r3.left
            float r8 = r6 - r7
            r9 = 0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x0050
        L_0x004e:
            r12 = 0
            goto L_0x0069
        L_0x0050:
            float r8 = r7 + r12
            float r10 = (float) r1
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x005d
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x004e
            float r12 = -r7
            goto L_0x0069
        L_0x005d:
            float r7 = r6 + r12
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0069
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x004e
            float r4 = r4 - r6
            r12 = r4
        L_0x0069:
            float r4 = r3.bottom
            float r6 = r3.top
            float r7 = r4 - r6
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0075
        L_0x0073:
            r13 = 0
            goto L_0x008e
        L_0x0075:
            float r7 = r6 + r13
            float r8 = (float) r1
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0082
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x0073
            float r13 = -r6
            goto L_0x008e
        L_0x0082:
            float r6 = r4 + r13
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x008e
            int r13 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x0073
            float r5 = r5 - r4
            r13 = r5
        L_0x008e:
            r2.h(r3)
            android.graphics.Matrix r2 = r11.mOuterMatrix
            r2.postTranslate(r12, r13)
            r11.dispatchOuterMatrixChanged()
            r11.invalidate()
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x00a6
            int r12 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.view.photo.PinchImageView.scrollBy(float, float):boolean");
    }

    @Override // tb.uzq.c
    public boolean canBeSwiped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cdc3488", new Object[]{this})).booleanValue();
        }
        if (getScale() <= 1.05f) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.mPinchMode == 2) {
            return true;
        }
        RectF imageBound = getImageBound(null);
        if (imageBound.isEmpty()) {
            return false;
        }
        if (i2 > 0) {
            if (imageBound.right > getWidth()) {
                return true;
            }
        } else if (imageBound.left < 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.mPinchMode == 2) {
            return true;
        }
        RectF imageBound = getImageBound(null);
        if (imageBound.isEmpty()) {
            return false;
        }
        if (i2 > 0) {
            if (imageBound.bottom > getHeight()) {
                return true;
            }
        } else if (imageBound.top < 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        try {
            if (this.cornerRadius > 0) {
                canvas.save();
                canvas.clipPath(genPath());
                super.dispatchDraw(canvas);
                canvas.restore();
            } else {
                super.dispatchDraw(canvas);
            }
        } catch (Throwable th) {
            tpu.Companion.a(TAG, "PinchImageView dispatchDraw", th);
        }
    }

    public final float getEndCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eaa1403", new Object[]{this})).floatValue();
        }
        return this.endCornerRadius;
    }

    public final float getScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue();
        }
        this.mOuterMatrix.getValues(this.mTempMatrix);
        return this.mTempMatrix[0];
    }

    public final float getStartCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("966d570a", new Object[]{this})).floatValue();
        }
        return this.startCornerRadius;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        try {
            if (isReady()) {
                if (!ckf.b(IDENTITY_M, this.mOuterMatrix)) {
                    setScaleType(ImageView.ScaleType.MATRIX);
                    d dVar = d.INSTANCE;
                    Matrix f2 = dVar.f();
                    setImageMatrix(getCurrentImageMatrix(f2));
                    dVar.e(f2);
                } else {
                    ImageView.ScaleType scaleType = this.mInitScaleType;
                    if (scaleType != null) {
                        ckf.d(scaleType);
                        setScaleType(scaleType);
                    }
                }
            }
            if (this.mMask != null) {
                canvas.save();
                RectF rectF = this.mMask;
                ckf.d(rectF);
                canvas.clipRect(rectF);
                super.onDraw(canvas);
                canvas.restore();
            } else if (this.cornerRadius > 0) {
                canvas.save();
                canvas.clipPath(genPath());
                super.onDraw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } catch (Throwable th) {
            tpu.Companion.a(TAG, "PinchImageView onDraw", th);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        setCornerRect();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        i iVar;
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "event");
        super.onTouchEvent(motionEvent);
        if (!this.mTouchable) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            if (this.mPinchMode == 2) {
                if (this.mZoomListener != null) {
                    d dVar = d.INSTANCE;
                    Matrix f2 = dVar.f();
                    getCurrentImageMatrix(f2);
                    float f3 = dVar.c(f2)[0];
                    dVar.e(f2);
                    k kVar2 = this.mZoomListener;
                    if (kVar2 != null) {
                        kVar2.a(f3);
                    }
                }
                scaleEnd();
            }
            this.mPinchMode = 0;
        } else if (action == 6) {
            if (this.mPinchMode == 2 && motionEvent.getPointerCount() > 2) {
                if ((motionEvent.getAction() >> 8) == 0) {
                    saveScaleContext(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    saveScaleContext(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                }
            }
        } else if (action == 0) {
            i iVar2 = this.mScaleAnimator;
            if (iVar2 == null || !iVar2.isRunning()) {
                cancelAllAnimator();
                this.mPinchMode = 1;
                this.mLastMovePoint.set(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 5) {
            if (!(this.mPinchMode == 2 || (kVar = this.mZoomListener) == null)) {
                kVar.c();
            }
            cancelAllAnimator();
            this.mPinchMode = 2;
            saveScaleContext(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
        } else if (action == 2 && ((iVar = this.mScaleAnimator) == null || !iVar.isRunning())) {
            int i2 = this.mPinchMode;
            if (i2 == 1) {
                scrollBy(motionEvent.getX() - this.mLastMovePoint.x, motionEvent.getY() - this.mLastMovePoint.y);
                this.mLastMovePoint.set(motionEvent.getX(), motionEvent.getY());
            } else if (i2 == 2 && motionEvent.getPointerCount() > 1) {
                d dVar2 = d.INSTANCE;
                float b2 = dVar2.b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                float[] a2 = dVar2.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                this.mLastMovePoint.set(a2[0], a2[1]);
                scale(this.mScaleCenter, this.mScaleBase, b2, this.mLastMovePoint);
            }
        }
        this.mGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    public final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mOuterMatrix.reset();
        dispatchOuterMatrixChanged();
        this.mMask = null;
        this.mPinchMode = 0;
        this.mLastMovePoint.set(0.0f, 0.0f);
        this.mScaleCenter.set(0.0f, 0.0f);
        this.mScaleBase = 0.0f;
        c cVar = this.mMaskAnimator;
        if (cVar != null) {
            cVar.cancel();
        }
        this.mMaskAnimator = null;
        cancelAllAnimator();
        invalidate();
    }

    public final void resumeScaleAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8550ffee", new Object[]{this});
        } else if (d.INSTANCE.c(this.mOuterMatrix)[0] > 1.0f) {
            doubleTap(0.0f, 0.0f);
        }
    }

    public final void setEndCornerRadius(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ec0519", new Object[]{this, new Float(f2)});
        } else {
            this.endCornerRadius = f2;
        }
    }

    public final void setFitMode(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6733f80a", new Object[]{this, new Integer(i2)});
        } else {
            this.mFitMode = i2;
        }
    }

    public final void setMaxZoom(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21494a4", new Object[]{this, new Float(f2)});
        } else {
            this.maxScale = f2;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.mOnClickListener = onClickListener;
        }
    }

    public final void setOnDoubleClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e800a8", new Object[]{this, onClickListener});
        } else {
            this.mOnDoubleClickListener = onClickListener;
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.mOnLongClickListener = onLongClickListener;
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8832c749", new Object[]{this, onTouchListener});
            return;
        }
        ckf.g(onTouchListener, "l");
        super.setOnTouchListener(onTouchListener);
        this.mOnTouchListener = onTouchListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        ckf.g(scaleType, "scaleType");
        super.setScaleType(scaleType);
    }

    public final void setStartCornerRadius(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69818ff2", new Object[]{this, new Float(f2)});
        } else {
            this.startCornerRadius = f2;
        }
    }

    public final void setTargetImageDrawable(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b198b582", new Object[]{this, bitmapDrawable});
            return;
        }
        ckf.g(bitmapDrawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        Drawable drawable = getDrawable();
        ckf.f(drawable, "getDrawable()");
        if (bitmapDrawable.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            int intrinsicWidth = (bitmapDrawable.getIntrinsicWidth() * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth();
            j jVar = new j(bitmapDrawable);
            ValueAnimator duration = ValueAnimator.ofInt(intrinsicWidth, bitmapDrawable.getIntrinsicHeight()).setDuration(150L);
            duration.addUpdateListener(new m(jVar, bitmapDrawable));
            jVar.a(0, (bitmapDrawable.getIntrinsicHeight() - intrinsicWidth) / 2);
            setImageDrawable(jVar);
            duration.start();
            return;
        }
        setImageDrawable(bitmapDrawable);
    }

    public final void setTouchable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28c7eb6", new Object[]{this, new Boolean(z)});
        } else {
            this.mTouchable = z;
        }
    }

    public final void setZoomListener(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c29e12d", new Object[]{this, kVar});
        } else {
            this.mZoomListener = kVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class j extends Drawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f7585a;
        public int b;
        public final Drawable c;

        static {
            t2o.a(918552803);
        }

        public j(Drawable drawable) {
            ckf.g(drawable, "internal");
            this.c = drawable;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1924089730) {
                super.setBounds(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            } else if (hashCode == -1831248357) {
                super.setBounds((Rect) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dressup/common/view/photo/PinchImageView$TransitionDrawable");
            }
        }

        public final void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5509c56c", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.f7585a = i;
            this.b = i2;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            ckf.g(canvas, "canvas");
            if (this.f7585a > 0 || this.b > 0) {
                canvas.save();
                canvas.clipRect(0, this.b, this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight() - this.b);
            }
            this.c.draw(canvas);
            if (this.f7585a > 0 || this.b > 0) {
                canvas.restore();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
            }
            return this.c.getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
            }
            return this.c.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
            }
            return this.c.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            } else {
                this.c.setAlpha(i);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d50b87e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.setBounds(i, i2, i3, i4);
            this.c.setBounds(i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            } else {
                this.c.setColorFilter(colorFilter);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92d95e1b", new Object[]{this, rect});
                return;
            }
            ckf.g(rect, "bounds");
            super.setBounds(rect);
            this.c.setBounds(rect);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animation", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class m implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f7587a;
        public final /* synthetic */ BitmapDrawable b;

        public m(j jVar, BitmapDrawable bitmapDrawable) {
            this.f7587a = jVar;
            this.b = bitmapDrawable;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.f(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f7587a.a(0, (this.b.getIntrinsicHeight() - ((Integer) animatedValue).intValue()) / 2);
                this.f7587a.invalidateSelf();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    private final void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mInitScaleType = getScaleType();
        this.mPath = new Path();
        this.mPaint = new Paint(1);
        this.mRectF = new RectF();
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        } else {
            ckf.y("mPaint");
            throw null;
        }
    }

    private final void setCornerRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5432e2", new Object[]{this});
        } else if (getDrawable() != null) {
            Drawable drawable = getDrawable();
            ckf.f(drawable, "getDrawable()");
            int intrinsicWidth = drawable.getIntrinsicWidth();
            Drawable drawable2 = getDrawable();
            ckf.f(drawable2, "getDrawable()");
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int width = getWidth();
            int i2 = (int) (width / (intrinsicWidth / intrinsicHeight));
            int height = (getHeight() - i2) / 2;
            RectF rectF = this.mRectF;
            if (rectF != null) {
                rectF.set(0, height, width, height + i2);
            } else {
                ckf.y("mRectF");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/dressup/common/view/photo/PinchImageView$c;", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/graphics/RectF;", "start", "end", "", "duration", "<init>", "(Lcom/taobao/android/dressup/common/view/photo/PinchImageView;Landroid/graphics/RectF;Landroid/graphics/RectF;J)V", "animation", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", "[F", "mStart", TplMsg.VALUE_T_NATIVE_RETURN, "mEnd", "c", "mResult", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public final class c extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final float[] f7581a;
        private final float[] b;
        private final float[] c = new float[4];
        public final /* synthetic */ PinchImageView d;

        static {
            t2o.a(918552796);
        }

        public c(PinchImageView pinchImageView, RectF rectF, RectF rectF2, long j) {
            ckf.g(rectF, "start");
            ckf.g(rectF2, "end");
            this.d = pinchImageView;
            this.f7581a = r0;
            this.b = r1;
            setFloatValues(0.0f, 1.0f);
            setDuration(j);
            addUpdateListener(this);
            float[] fArr = {rectF.left, rectF.top, rectF.right, rectF.bottom};
            float[] fArr2 = {rectF2.left, rectF2.top, rectF2.right, rectF2.bottom};
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/photo/PinchImageView$MaskAnimator");
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                for (int i = 0; i <= 3; i++) {
                    float[] fArr = this.c;
                    float f = this.f7581a[i];
                    fArr[i] = f + ((this.b[i] - f) * floatValue);
                }
                if (PinchImageView.access$getMMask$p(this.d) == null) {
                    PinchImageView.access$setMMask$p(this.d, new RectF());
                }
                RectF access$getMMask$p = PinchImageView.access$getMMask$p(this.d);
                ckf.d(access$getMMask$p);
                float[] fArr2 = this.c;
                access$getMMask$p.set(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
                this.d.invalidate();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    private final boolean isSwapping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1e7bdda", new Object[]{this})).booleanValue();
        }
        View.OnTouchListener onTouchListener = this.mOnTouchListener;
        if (!(onTouchListener instanceof uzq)) {
            return false;
        }
        if (onTouchListener != null) {
            return ((uzq) onTouchListener).g();
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.view.photo.SwipeToDismissTouchListener");
    }

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.maxScale = 10.0f;
        this.mOuterMatrix = new Matrix();
        this.mTempMatrix = new float[9];
        this.mLastMovePoint = new PointF();
        this.mScaleCenter = new PointF();
        this.mGestureDetector = new GestureDetector(getContext(), new l());
        initView();
    }

    public PinchImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.maxScale = 10.0f;
        this.mOuterMatrix = new Matrix();
        this.mTempMatrix = new float[9];
        this.mLastMovePoint = new PointF();
        this.mScaleCenter = new PointF();
        this.mGestureDetector = new GestureDetector(getContext(), new l());
        initView();
    }
}
