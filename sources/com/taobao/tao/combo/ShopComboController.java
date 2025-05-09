package com.taobao.tao.combo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.combo.a;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavCheckcollectResponse;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavCheckcollectResponseData;
import com.taobao.tao.combo.dataobject.ComboData;
import com.taobao.tao.combo.dataobject.ComboItemData;
import com.taobao.tao.combo.dataobject.ComboResponse;
import com.taobao.tao.combo.ui.DirectionVerticalViewPager;
import com.taobao.tao.combo.ui.DirectionViewPager;
import com.taobao.tao.combo.ui.IconPageIndicator;
import com.taobao.tao.combo.ui.VerticalViewPager;
import com.taobao.tao.combo.ui.VerticallinePageIndicator;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TPriceTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b29;
import tb.crp;
import tb.drp;
import tb.frp;
import tb.hq9;
import tb.ifw;
import tb.jbx;
import tb.m24;
import tb.n24;
import tb.pv8;
import tb.q5j;
import tb.qh8;
import tb.t2o;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShopComboController implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CANCEL_FAV_TYPE = 3;
    private static final int CHECK_COLLECT = 4;
    private static final int FAV_TYPE = 2;
    private static final int GETMEAL_TYPE = 1;
    private static final int UISIZE = 56;
    private String commonUTStr;
    private ActionBar mActionBar;
    private LinearLayout mButtomView;
    private Button mBuyBtn;
    private m24 mComboBusiness;
    private ComboData mComboData;
    private IconPageIndicator mComboIconPageIndicator;
    private long mComboId;
    private i mComboIdManager;
    private j mComboImageClickedObserve;
    private TPriceTextView mComboPrice;
    private ComboViewPagerChangedObserve mComboViewPagerChangedObserve;
    private ShopComboActivity mContext;
    private k mCurrentComboData;
    private LinearLayout mDetailLayout;
    private qh8 mErrorController;
    private b29 mFavCollectBusiness;
    private ImageView mFavoriteImg;
    private LinearLayout mFavoriteLayout;
    private long mFirstEntryItemId;
    private boolean mIsLogin;
    private int mItemCount;
    private TextView mItemName;
    private TPriceTextView mItemPrice;
    private LinearLayout mLayout;
    private Animation mLoadAnimation;
    private PreLoadBusiness mPreLoadBusiness;
    private ProgressBar mProgressBar;
    private TextView mSavePrice;
    private long mSellerId;
    private RelativeLayout mTopView;
    private DirectionViewPager mViewPager;
    private ComboViewPagerAdapter mViewPagerAdapter;
    private ifw mViewPagerManager;
    private String mWeapp;
    private String mWepk;
    private String mWpm;
    private boolean mIsGetNextData = false;
    private boolean mIsGetPreData = false;
    private boolean mIsVisibale = true;
    private int mCurrentItemIndex = 0;
    private boolean mIsFirstRequset = true;
    private ArrayList<View> mViews = new ArrayList<>();
    private boolean mIsAutoScrollBack = false;
    private boolean mIsVerticalScroll = false;
    private boolean mIsAddFavFromUnLogin = false;
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.tao.combo.ShopComboController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ShopComboController$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null && h.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()] == 1 && !ShopComboController.access$000(ShopComboController.this)) {
                LoginBroadcastHelper.unregisterLoginReceiver(ShopComboController.access$100(ShopComboController.this), ShopComboController.access$200(ShopComboController.this));
                if (ShopComboController.access$300(ShopComboController.this) && ShopComboController.access$400(ShopComboController.this) != null) {
                    ShopComboController.access$002(ShopComboController.this, true);
                    n24.a();
                    ShopComboController.access$502(ShopComboController.this, true);
                    ShopComboController shopComboController = ShopComboController.this;
                    ShopComboController.access$602(shopComboController, ShopComboController.access$400(shopComboController).b);
                    ShopComboController shopComboController2 = ShopComboController.this;
                    ShopComboController.access$702(shopComboController2, ShopComboController.access$400(shopComboController2).f11940a);
                    ShopComboController shopComboController3 = ShopComboController.this;
                    ShopComboController.access$800(shopComboController3, ShopComboController.access$700(shopComboController3), true);
                    ShopComboController.access$402(ShopComboController.this, null);
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ComboViewPagerChangedObserve implements ViewPager.OnPageChangeListener, DirectionViewPager.a, DirectionViewPager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764412062);
            t2o.a(764412083);
            t2o.a(764412084);
        }

        public ComboViewPagerChangedObserve() {
        }

        public final void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f82f78d5", new Object[]{this, new Long(j)});
                return;
            }
            ShopComboController.access$2100(ShopComboController.this, "Button", "NextMeal", "collocation_id=" + j + ",seller_id=" + ShopComboController.access$1900(ShopComboController.this));
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb3d31ac", new Object[]{this});
                return;
            }
            ShopComboController.access$3700(ShopComboController.this);
            ShopComboController shopComboController = ShopComboController.this;
            ShopComboController.access$702(shopComboController, ShopComboController.access$3000(shopComboController).c());
            if (-1 != ShopComboController.access$700(ShopComboController.this)) {
                ShopComboController.access$1000(ShopComboController.this).b(1, ShopComboController.access$700(ShopComboController.this), false);
            }
            ShopComboController.access$3402(ShopComboController.this, false);
            a(ShopComboController.access$700(ShopComboController.this));
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("797b8628", new Object[]{this});
                return;
            }
            ShopComboController.access$3700(ShopComboController.this);
            ShopComboController shopComboController = ShopComboController.this;
            ShopComboController.access$702(shopComboController, ShopComboController.access$3000(shopComboController).d());
            if (-1 != ShopComboController.access$700(ShopComboController.this)) {
                ShopComboController.access$1000(ShopComboController.this).b(1, ShopComboController.access$700(ShopComboController.this), false);
            }
            ShopComboController.access$3302(ShopComboController.this, false);
            a(ShopComboController.access$700(ShopComboController.this));
        }

        public void d(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a8e1cac", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 == 0) {
                if (ShopComboController.access$3400(ShopComboController.this)) {
                    b();
                }
                if (!ShopComboController.access$3000(ShopComboController.this).f()) {
                    return;
                }
                if (ShopComboController.access$3500(ShopComboController.this) == i || (1 == ShopComboController.access$3000(ShopComboController.this).i() && ShopComboController.access$3500(ShopComboController.this) - 1 == i)) {
                    ShopComboController shopComboController = ShopComboController.this;
                    ShopComboController.access$3600(shopComboController, ShopComboController.access$3200(shopComboController, R.string.combo_last_combo_toast));
                }
            } else if (i2 == 1) {
                if (ShopComboController.access$3300(ShopComboController.this)) {
                    c();
                }
                if (ShopComboController.access$3000(ShopComboController.this).g() && i == 0) {
                    ShopComboController shopComboController2 = ShopComboController.this;
                    ShopComboController.access$3600(shopComboController2, ShopComboController.access$3200(shopComboController2, R.string.combo_first_combo_toast));
                }
            }
        }

        public void e(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d84d7c5d", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else if (3 != i) {
                if (i != 0 && 1 == i2 && Math.abs(f) < (frp.d() / 4) - 10) {
                    ((TextView) ((View) ShopComboController.access$2900(ShopComboController.this).get(0)).findViewById(R.id.shop_combo_padding_left_layout_tv)).setText(ShopComboController.access$3200(ShopComboController.this, R.string.combo_padding_left_continue));
                    ShopComboController.access$3302(ShopComboController.this, false);
                } else if ((2 == i || i == 0) && ShopComboController.access$2900(ShopComboController.this).size() - 2 == i2 && Math.abs(f) < (frp.d() / 4) - 10) {
                    ((TextView) ((View) ShopComboController.access$2900(ShopComboController.this).get(ShopComboController.access$2900(ShopComboController.this).size() - 1)).findViewById(R.id.shop_combo_padding_right_layout_tv)).setText(ShopComboController.access$3200(ShopComboController.this, R.string.combo_padding_right_continue));
                    ShopComboController.access$3402(ShopComboController.this, false);
                }
            }
        }

        public void f(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("213a52aa", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else if (3 != i) {
                if (i != 0 && 1 == i2 && f > frp.d() / 4) {
                    ((TextView) ((View) ShopComboController.access$2900(ShopComboController.this).get(0)).findViewById(R.id.shop_combo_padding_left_layout_tv)).setText(ShopComboController.access$3200(ShopComboController.this, R.string.combo_padding_left_get));
                    ShopComboController.access$3302(ShopComboController.this, true);
                } else if ((2 == i || i == 0) && ShopComboController.access$2900(ShopComboController.this).size() - 2 == i2 && f < (-frp.d()) / 4) {
                    ((TextView) ((View) ShopComboController.access$2900(ShopComboController.this).get(ShopComboController.access$2900(ShopComboController.this).size() - 1)).findViewById(R.id.shop_combo_padding_right_layout_tv)).setText(ShopComboController.access$3200(ShopComboController.this, R.string.combo_padding_right_get));
                    ShopComboController.access$3402(ShopComboController.this, true);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else if (-1 == i) {
                ShopComboController.access$2700(ShopComboController.this).setCurrentItem(0);
                ShopComboController.access$2802(ShopComboController.this, true);
            } else if (-2 == i) {
                int size = ShopComboController.access$2900(ShopComboController.this).size();
                ShopComboController.access$2802(ShopComboController.this, true);
                if (ShopComboController.access$3000(ShopComboController.this).g()) {
                    ShopComboController.access$2700(ShopComboController.this).setCurrentItem(size - 2);
                } else {
                    ShopComboController.access$2700(ShopComboController.this).setCurrentItem(size - 3);
                }
            } else {
                if (!ShopComboController.access$2800(ShopComboController.this)) {
                    crp.a("Page_ShopcollocationDetail", "Button", "MovePic", ShopComboController.access$1800(ShopComboController.this) + ",item_id=" + ShopComboController.access$1300(ShopComboController.this));
                }
                ShopComboController.access$2802(ShopComboController.this, false);
                ShopComboController.access$3100(ShopComboController.this, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ShopComboController.access$1000(ShopComboController.this).b(1, ShopComboController.access$700(ShopComboController.this), ShopComboController.access$500(ShopComboController.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ShopComboController shopComboController) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TextUtils.isEmpty(Login.getSid())) {
                ShopComboController.access$1102(ShopComboController.this, true);
                ShopComboController.access$002(ShopComboController.this, false);
                ShopComboController.access$402(ShopComboController.this, new k());
                ShopComboController.access$400(ShopComboController.this).f11940a = ShopComboController.access$700(ShopComboController.this);
                ShopComboController.access$400(ShopComboController.this).b = ShopComboController.access$1300(ShopComboController.this);
                ShopComboController.access$1400(ShopComboController.this);
            } else if (ShopComboController.access$1600(ShopComboController.this).itemList.get(ShopComboController.access$1500(ShopComboController.this)).isFavor) {
                ShopComboController.access$1700(ShopComboController.this).a(3, ShopComboController.access$1300(ShopComboController.this));
            } else {
                ShopComboController.access$1700(ShopComboController.this).c(2, ShopComboController.access$1300(ShopComboController.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("id", Long.toString(ShopComboController.access$1300(ShopComboController.this)));
            bundle.putString("collocation_id", Long.toString(ShopComboController.access$700(ShopComboController.this)));
            Nav.from(Globals.getApplication()).withExtras(bundle).toUri(pv8.DETAIL_URL_PRE_1);
            crp.a("Page_ShopcollocationDetail", "Button", "ItemDetail", ShopComboController.access$1800(ShopComboController.this) + ",item_id=" + ShopComboController.access$1300(ShopComboController.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("itemId", Long.toString(ShopComboController.access$1300(ShopComboController.this)));
            bundle.putString("comboId", Long.toString(ShopComboController.access$700(ShopComboController.this)));
            bundle.putString("sellerId", Long.toString(ShopComboController.access$1900(ShopComboController.this)));
            if (ShopComboController.access$1600(ShopComboController.this) != null && !TextUtils.isEmpty(ShopComboController.access$1600(ShopComboController.this).type)) {
                bundle.putString("type", ShopComboController.access$1600(ShopComboController.this).type);
            }
            Nav.from(Globals.getApplication()).withExtras(bundle).toUri("http://h5.m.taobao.com/detailplugin/mix.html?itemId=" + Long.toString(ShopComboController.access$1300(ShopComboController.this)) + "&comboId=" + Long.toString(ShopComboController.access$700(ShopComboController.this)) + "&sellerId=" + Long.toString(ShopComboController.access$1900(ShopComboController.this)) + "&type=" + ShopComboController.access$1600(ShopComboController.this).type);
            StringBuilder sb = new StringBuilder();
            sb.append(ShopComboController.access$1800(ShopComboController.this));
            sb.append(",item_id=");
            sb.append(ShopComboController.access$1300(ShopComboController.this));
            crp.a("Page_ShopcollocationDetail", "Button", "Buy", sb.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements DirectionVerticalViewPager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.tao.combo.ui.DirectionVerticalViewPager.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a8e1cac", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                ShopComboController.access$2002(ShopComboController.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g extends VerticalViewPager.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ShopComboController$8");
        }

        @Override // com.taobao.tao.combo.ui.VerticalViewPager.g, com.taobao.tao.combo.ui.VerticalViewPager.e
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else if (ShopComboController.access$2000(ShopComboController.this)) {
                ShopComboController.access$2002(ShopComboController.this, false);
                ShopComboController.access$2100(ShopComboController.this, "Button", "RecommendItem", z9u.ARG_ITEM_ID + ShopComboController.access$1300(ShopComboController.this) + ",collocation_id=" + ShopComboController.access$700(ShopComboController.this) + ",seller_id=" + ShopComboController.access$1900(ShopComboController.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class h {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_COMBO_ID = -1;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<Long> f11938a;
        public long b;

        static {
            t2o.a(764412060);
        }

        public i(ShopComboController shopComboController, ArrayList<Long> arrayList, long j) {
            this.f11938a = arrayList;
            this.b = j;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
            }
            return e(Long.valueOf(this.b));
        }

        public ArrayList<Long> b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("816087f1", new Object[]{this, new Long(j)});
            }
            ArrayList<Long> arrayList = new ArrayList<>();
            if (j < 0) {
                return arrayList;
            }
            int e = e(Long.valueOf(j));
            int i = e - 1;
            if (i >= 0) {
                arrayList.add(this.f11938a.get(i));
            }
            int i2 = e + 1;
            if (i2 < i()) {
                arrayList.add(this.f11938a.get(i2));
            }
            return arrayList;
        }

        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90d778df", new Object[]{this})).longValue();
            }
            if (f()) {
                return -1L;
            }
            return this.f11938a.get(a() + 1).longValue();
        }

        public long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("80a1d5e3", new Object[]{this})).longValue();
            }
            if (g()) {
                return -1L;
            }
            return this.f11938a.get(a() - 1).longValue();
        }

        public int e(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f0187d4", new Object[]{this, l})).intValue();
            }
            if (l.longValue() < 0) {
                return -1;
            }
            return this.f11938a.indexOf(l);
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7d926f5c", new Object[]{this})).booleanValue();
            }
            if (a() == this.f11938a.size() - 1) {
                return true;
            }
            return false;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4e18c131", new Object[]{this})).booleanValue();
            }
            if (a() == 0) {
                return true;
            }
            return false;
        }

        public void h(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b779142b", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }

        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.f11938a.size();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764412061);
            t2o.a(764412043);
        }

        public j() {
        }

        @Override // com.taobao.tao.combo.a.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a4c31cf", new Object[]{this});
                return;
            }
            if (ShopComboController.access$2200(ShopComboController.this) != null) {
                int d = ShopComboController.access$2200(ShopComboController.this).d();
                for (int i = 0; i < d; i++) {
                    ShopComboController.access$2200(ShopComboController.this).c(i).z();
                }
            }
            if (ShopComboController.access$2300(ShopComboController.this)) {
                ShopComboController.access$2302(ShopComboController.this, false);
                ShopComboController.access$2400(ShopComboController.this).setVisibility(8);
                ShopComboController.access$2500(ShopComboController.this).setVisibility(8);
                ShopComboController.access$2600(ShopComboController.this).hide();
                return;
            }
            ShopComboController.access$2302(ShopComboController.this, true);
            ShopComboController.access$2400(ShopComboController.this).setVisibility(0);
            ShopComboController.access$2500(ShopComboController.this).setVisibility(0);
            ShopComboController.access$2600(ShopComboController.this).show();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k {

        /* renamed from: a  reason: collision with root package name */
        public long f11940a;
        public long b;

        static {
            t2o.a(764412063);
        }

        public k(ShopComboController shopComboController) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements IconPageIndicator.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764412064);
            t2o.a(764412089);
        }

        public l() {
        }

        @Override // com.taobao.tao.combo.ui.IconPageIndicator.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5eb46ad", new Object[]{this, new Integer(i)});
            } else if (ShopComboController.access$1600(ShopComboController.this) != null && ShopComboController.access$1600(ShopComboController.this).itemList != null) {
                crp.a("Page_ShopcollocationDetail", "Button", "ItemPic", ShopComboController.access$1800(ShopComboController.this) + ",item_id=" + ShopComboController.access$1600(ShopComboController.this).itemList.get(i).itemId);
            }
        }
    }

    static {
        t2o.a(764412050);
        t2o.a(589299719);
    }

    public ShopComboController(ShopComboActivity shopComboActivity) {
        this.mFirstEntryItemId = -1L;
        this.mIsLogin = false;
        this.mContext = shopComboActivity;
        n24.a();
        this.mIsLogin = isLogin();
        Intent intent = this.mContext.getIntent();
        this.mSellerId = intent.getLongExtra("seller_id", -1L);
        this.mComboId = intent.getIntExtra("meal_id", -1);
        this.mFirstEntryItemId = intent.getLongExtra("item_id", -1L);
        this.mWeapp = intent.getStringExtra("wp_app");
        this.mWepk = intent.getStringExtra("wp_pk");
        this.mWpm = intent.getStringExtra("wp_m");
        if (-1 == this.mSellerId || -1 == this.mComboId || -1 == this.mFirstEntryItemId) {
            getDataFromUrl(this.mContext.getIntent().getData());
            if (-1 == this.mSellerId || -1 == this.mComboId || -1 == this.mFirstEntryItemId) {
                return;
            }
        }
        this.mViewPagerManager = new ifw();
        initView();
        init();
        this.commonUTStr = "collocation_id=" + this.mComboId + ",seller_id=" + this.mSellerId;
        startRequest(this.mComboId, true);
    }

    public static /* synthetic */ boolean access$000(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de162d77", new Object[]{shopComboController})).booleanValue();
        }
        return shopComboController.mIsLogin;
    }

    public static /* synthetic */ boolean access$002(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58457783", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsLogin = z;
        return z;
    }

    public static /* synthetic */ ShopComboActivity access$100(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopComboActivity) ipChange.ipc$dispatch("d108ecb", new Object[]{shopComboController});
        }
        return shopComboController.mContext;
    }

    public static /* synthetic */ m24 access$1000(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m24) ipChange.ipc$dispatch("43e70bf6", new Object[]{shopComboController});
        }
        return shopComboController.mComboBusiness;
    }

    public static /* synthetic */ boolean access$1102(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f6913", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsAddFavFromUnLogin = z;
        return z;
    }

    public static /* synthetic */ long access$1300(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7752fdd9", new Object[]{shopComboController})).longValue();
        }
        return shopComboController.getCurrentItemId();
    }

    public static /* synthetic */ void access$1400(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76dc97e6", new Object[]{shopComboController});
        } else {
            shopComboController.login();
        }
    }

    public static /* synthetic */ int access$1500(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("766631da", new Object[]{shopComboController})).intValue();
        }
        return shopComboController.mCurrentItemIndex;
    }

    public static /* synthetic */ ComboData access$1600(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComboData) ipChange.ipc$dispatch("259f4a86", new Object[]{shopComboController});
        }
        return shopComboController.mComboData;
    }

    public static /* synthetic */ b29 access$1700(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b29) ipChange.ipc$dispatch("d34191ab", new Object[]{shopComboController});
        }
        return shopComboController.mFavCollectBusiness;
    }

    public static /* synthetic */ String access$1800(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("360d85f6", new Object[]{shopComboController});
        }
        return shopComboController.commonUTStr;
    }

    public static /* synthetic */ long access$1900(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("748c99df", new Object[]{shopComboController})).longValue();
        }
        return shopComboController.mSellerId;
    }

    public static /* synthetic */ BroadcastReceiver access$200(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("3036b82c", new Object[]{shopComboController});
        }
        return shopComboController.mBroadcastReceiver;
    }

    public static /* synthetic */ boolean access$2000(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a5fd605", new Object[]{shopComboController})).booleanValue();
        }
        return shopComboController.mIsVerticalScroll;
    }

    public static /* synthetic */ boolean access$2002(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5530e0b5", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsVerticalScroll = z;
        return z;
    }

    public static /* synthetic */ void access$2100(ShopComboController shopComboController, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7112dc60", new Object[]{shopComboController, str, str2, str3});
        } else {
            shopComboController.userTrack(str, str2, str3);
        }
    }

    public static /* synthetic */ ifw access$2200(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ifw) ipChange.ipc$dispatch("108fbfc4", new Object[]{shopComboController});
        }
        return shopComboController.mViewPagerManager;
    }

    public static /* synthetic */ boolean access$2300(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68fca408", new Object[]{shopComboController})).booleanValue();
        }
        return shopComboController.mIsVisibale;
    }

    public static /* synthetic */ boolean access$2302(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a2dd312", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsVisibale = z;
        return z;
    }

    public static /* synthetic */ RelativeLayout access$2400(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("1e754455", new Object[]{shopComboController});
        }
        return shopComboController.mTopView;
    }

    public static /* synthetic */ LinearLayout access$2500(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("29f7245d", new Object[]{shopComboController});
        }
        return shopComboController.mButtomView;
    }

    public static /* synthetic */ ActionBar access$2600(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("78093661", new Object[]{shopComboController});
        }
        return shopComboController.mActionBar;
    }

    public static /* synthetic */ IconPageIndicator access$2700(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconPageIndicator) ipChange.ipc$dispatch("b36a6b8c", new Object[]{shopComboController});
        }
        return shopComboController.mComboIconPageIndicator;
    }

    public static /* synthetic */ boolean access$2800(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66aca60d", new Object[]{shopComboController})).booleanValue();
        }
        return shopComboController.mIsAutoScrollBack;
    }

    public static /* synthetic */ boolean access$2802(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e27e11ad", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsAutoScrollBack = z;
        return z;
    }

    public static /* synthetic */ ArrayList access$2900(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d87abae4", new Object[]{shopComboController});
        }
        return shopComboController.mViews;
    }

    public static /* synthetic */ boolean access$300(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcb2fb7a", new Object[]{shopComboController})).booleanValue();
        }
        return shopComboController.isLogin();
    }

    public static /* synthetic */ i access$3000(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("b99ce3c", new Object[]{shopComboController});
        }
        return shopComboController.mComboIdManager;
    }

    public static /* synthetic */ void access$3100(ShopComboController shopComboController, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d02102", new Object[]{shopComboController, new Integer(i2)});
        } else {
            shopComboController.setTopViewData(i2);
        }
    }

    public static /* synthetic */ String access$3200(ShopComboController shopComboController, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df75339f", new Object[]{shopComboController, new Integer(i2)});
        }
        return shopComboController.getResourcesString(i2);
    }

    public static /* synthetic */ boolean access$3300(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aa64a27", new Object[]{shopComboController})).booleanValue();
        }
        return shopComboController.mIsGetPreData;
    }

    public static /* synthetic */ boolean access$3302(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6db8f0d3", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsGetPreData = z;
        return z;
    }

    public static /* synthetic */ boolean access$3400(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a2fe428", new Object[]{shopComboController})).booleanValue();
        }
        return shopComboController.mIsGetNextData;
    }

    public static /* synthetic */ boolean access$3402(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f6296f2", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsGetNextData = z;
        return z;
    }

    public static /* synthetic */ int access$3500(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59b97e18", new Object[]{shopComboController})).intValue();
        }
        return shopComboController.mItemCount;
    }

    public static /* synthetic */ void access$3600(ShopComboController shopComboController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bcc470", new Object[]{shopComboController, str});
        } else {
            shopComboController.showToast(str);
        }
    }

    public static /* synthetic */ void access$3700(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ccb227", new Object[]{shopComboController});
        } else {
            shopComboController.showProgress();
        }
    }

    public static /* synthetic */ k access$400(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("f1b7ea38", new Object[]{shopComboController});
        }
        return shopComboController.mCurrentComboData;
    }

    public static /* synthetic */ k access$402(ShopComboController shopComboController, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("d0669539", new Object[]{shopComboController, kVar});
        }
        shopComboController.mCurrentComboData = kVar;
        return kVar;
    }

    public static /* synthetic */ boolean access$500(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbc62f7c", new Object[]{shopComboController})).booleanValue();
        }
        return shopComboController.mIsFirstRequset;
    }

    public static /* synthetic */ boolean access$502(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1095b61e", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsFirstRequset = z;
        return z;
    }

    public static /* synthetic */ long access$602(ShopComboController shopComboController, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23f201d", new Object[]{shopComboController, new Long(j2)})).longValue();
        }
        shopComboController.mFirstEntryItemId = j2;
        return j2;
    }

    public static /* synthetic */ long access$700(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dad9636e", new Object[]{shopComboController})).longValue();
        }
        return shopComboController.mComboId;
    }

    public static /* synthetic */ long access$702(ShopComboController shopComboController, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3e8c63c", new Object[]{shopComboController, new Long(j2)})).longValue();
        }
        shopComboController.mComboId = j2;
        return j2;
    }

    public static /* synthetic */ void access$800(ShopComboController shopComboController, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda89f4b", new Object[]{shopComboController, new Long(j2), new Boolean(z)});
        } else {
            shopComboController.startRequest(j2, z);
        }
    }

    private void errorProc(int i2, MtopResponse mtopResponse, Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ad09ff", new Object[]{this, new Integer(i2), mtopResponse, obj});
        } else if (this.mContext != null) {
            if (i2 == 1) {
                hideProgress();
                qh8 qh8Var = this.mErrorController;
                if (!mtopResponse.getRetCode().equals("FAIL_SYS_FLOWLIMIT") && !mtopResponse.getRetCode().equals(q5j.TRAFFIC_LIMIT_STATUS) && !mtopResponse.getRetCode().equals("ANDROID_SYS_API_LOCKED_IN_10_SECONDS")) {
                    z = false;
                }
                qh8Var.h(z);
            } else if (i2 == 2) {
                showToast(getResourcesString(R.string.combo_fav_fail));
            } else if (i2 == 3) {
                showToast(getResourcesString(R.string.combo_cancel_fav_fail));
            }
        }
    }

    private void freshTitle(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b228a549", new Object[]{this, str, new Long(j2)});
        } else if (str != null && j2 >= 0) {
            this.mActionBar.setTitle(str);
        }
    }

    private ArrayList<View> genViews(int i2) {
        ShopComboActivity shopComboActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fe3269f8", new Object[]{this, new Integer(i2)});
        }
        this.mViews.clear();
        this.mViewPagerManager.b();
        ComboData comboData = this.mComboData;
        if (comboData == null || comboData.itemList == null || (shopComboActivity = this.mContext) == null) {
            return null;
        }
        LayoutInflater layoutInflater = shopComboActivity.getLayoutInflater();
        if (!(i2 == 0 || 3 == i2)) {
            this.mViews.add(layoutInflater.inflate(R.layout.shop_combo_padding_left_layout, (ViewGroup) null));
        }
        int size = this.mComboData.itemList.size();
        for (int i3 = 0; i3 < size; i3++) {
            FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.shop_combo_vertical_view_pager_layout, (ViewGroup) null);
            DirectionVerticalViewPager directionVerticalViewPager = (DirectionVerticalViewPager) frameLayout.findViewById(R.id.shop_combo_vertical_view_pager);
            directionVerticalViewPager.setOffscreenPageLimit(1);
            com.taobao.tao.combo.a aVar = new com.taobao.tao.combo.a(this.mContext);
            directionVerticalViewPager.setAdapter(aVar);
            directionVerticalViewPager.setDirectionListener(new f());
            aVar.x(this.mComboImageClickedObserve);
            VerticallinePageIndicator verticallinePageIndicator = (VerticallinePageIndicator) frameLayout.findViewById(R.id.shop_combo_vertical_indicator);
            verticallinePageIndicator.setViewPager(directionVerticalViewPager, 0);
            verticallinePageIndicator.setOnPageChangeListener(new g());
            aVar.y(this.mComboData.itemList.get(i3).picUrlList);
            verticallinePageIndicator.notifyDataSetChanged();
            this.mViews.add(frameLayout);
            this.mViewPagerManager.a(aVar);
        }
        if (!(1 == i2 || 3 == i2)) {
            this.mViews.add(layoutInflater.inflate(R.layout.shop_combo_padding_right_layout, (ViewGroup) null));
        }
        return this.mViews;
    }

    private long getCurrentItemId() {
        ArrayList<ComboItemData> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0aa76ac", new Object[]{this})).longValue();
        }
        ComboData comboData = this.mComboData;
        if (!(comboData == null || (arrayList = comboData.itemList) == null || arrayList.get(this.mCurrentItemIndex) == null)) {
            try {
                return this.mComboData.itemList.get(this.mCurrentItemIndex).itemId;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return -1L;
    }

    private void getDataFromUrl(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38106f9b", new Object[]{this, uri});
        } else if (uri != null) {
            String queryParameter = uri.getQueryParameter("seller_id");
            String queryParameter2 = uri.getQueryParameter("meal_id");
            String queryParameter3 = uri.getQueryParameter("item_id");
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
                try {
                    this.mSellerId = Long.parseLong(queryParameter);
                    this.mComboId = Integer.parseInt(queryParameter2);
                    this.mFirstEntryItemId = Long.parseLong(queryParameter3);
                    this.mWeapp = uri.getQueryParameter("wp_app");
                    this.mWepk = uri.getQueryParameter("wp_pk");
                    this.mWpm = uri.getQueryParameter("wp_m");
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    private Drawable getResourcesDrawable(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("200f510b", new Object[]{this, new Integer(i2)});
        }
        return this.mContext.getResources().getDrawable(i2);
    }

    private String getResourcesString(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1022fd24", new Object[]{this, new Integer(i2)});
        }
        return this.mContext.getResources().getString(i2);
    }

    private void hideProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713c696", new Object[]{this});
        } else {
            this.mProgressBar.setVisibility(8);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mTopView.setOnTouchListener(new b(this));
        this.mFavoriteLayout.setOnClickListener(new c());
        this.mDetailLayout.setOnClickListener(new d());
        this.mBuyBtn.setOnClickListener(new e());
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.shop_combo_load_data_alpha);
        this.mActionBar = this.mContext.getSupportActionBar();
        this.mProgressBar = (ProgressBar) this.mContext.findViewById(R.id.shop_combo_view_progress);
        this.mTopView = (RelativeLayout) this.mContext.findViewById(R.id.shop_combo_main_top_view);
        this.mItemName = (TextView) this.mContext.findViewById(R.id.shop_combo_main_top_item_name_tv);
        this.mItemPrice = (TPriceTextView) this.mContext.findViewById(R.id.shop_combo_main_top_item_price_all);
        this.mFavoriteImg = (ImageView) this.mContext.findViewById(R.id.shop_combo_main_top_item_favorite_img);
        this.mFavoriteLayout = (LinearLayout) this.mContext.findViewById(R.id.shop_combo_main_top_item_favorite);
        this.mDetailLayout = (LinearLayout) this.mContext.findViewById(R.id.shop_combo_main_top_item_detail);
        this.mButtomView = (LinearLayout) this.mContext.findViewById(R.id.shop_combo_main_buttom_view);
        this.mSavePrice = (TextView) this.mContext.findViewById(R.id.shop_combo_buttom_savemoney_tv);
        this.mBuyBtn = (Button) this.mContext.findViewById(R.id.shop_combo_buttom_buy_bt);
        this.mComboPrice = (TPriceTextView) this.mContext.findViewById(R.id.shop_combo_buttom_layout_price);
        this.mLayout = (LinearLayout) this.mContext.findViewById(R.id.shop_combo_buttom_layout);
        DirectionViewPager directionViewPager = (DirectionViewPager) this.mContext.findViewById(R.id.shop_combo_viewpager);
        this.mViewPager = directionViewPager;
        directionViewPager.setOffscreenPageLimit(1);
        IconPageIndicator iconPageIndicator = (IconPageIndicator) this.mContext.findViewById(R.id.shop_combo_buttom_layout_scroll);
        this.mComboIconPageIndicator = iconPageIndicator;
        iconPageIndicator.setIconClickedListener(new l());
        this.mComboImageClickedObserve = new j();
        m24 m24Var = new m24(Globals.getApplication(), this.mSellerId, new Handler());
        this.mComboBusiness = m24Var;
        m24Var.setRemoteBaseListener(this);
        this.mPreLoadBusiness = new PreLoadBusiness(Globals.getApplication(), this.mSellerId);
        b29 b29Var = new b29(Globals.getApplication());
        this.mFavCollectBusiness = b29Var;
        b29Var.setRemoteBaseListener(this);
        qh8 qh8Var = new qh8(this.mContext);
        this.mErrorController = qh8Var;
        qh8Var.g(new a());
    }

    private boolean isLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        if (Login.getSid() == null) {
            return false;
        }
        return true;
    }

    private void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
            return;
        }
        LoginBroadcastHelper.registerLoginReceiver(this.mContext, this.mBroadcastReceiver);
        Login.login(true);
    }

    private void setAdapterData(int i2) {
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8d8be5", new Object[]{this, new Integer(i2)});
            return;
        }
        if (this.mComboIdManager.g() && 1 != this.mComboIdManager.i()) {
            i3 = 0;
        } else if (this.mComboIdManager.f() && 1 != this.mComboIdManager.i()) {
            i3 = 1;
        } else if (1 == this.mComboIdManager.i()) {
            i3 = 3;
        }
        ArrayList<View> genViews = genViews(i3);
        ArrayList<ComboItemData> arrayList = this.mComboData.itemList;
        int size = arrayList.size();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(drp.a(arrayList.get(i4).mainPicUrl, 56));
        }
        this.mViewPager.startAnimation(this.mLoadAnimation);
        ComboViewPagerAdapter comboViewPagerAdapter = new ComboViewPagerAdapter();
        this.mViewPagerAdapter = comboViewPagerAdapter;
        this.mViewPager.setAdapter(comboViewPagerAdapter);
        this.mViewPager.setViewPagerClassify(i3);
        ComboViewPagerChangedObserve comboViewPagerChangedObserve = new ComboViewPagerChangedObserve();
        this.mComboViewPagerChangedObserve = comboViewPagerChangedObserve;
        this.mViewPager.setOnDirectionPagerChangeListener(comboViewPagerChangedObserve);
        this.mViewPager.setOnDirectionPagerMoved(this.mComboViewPagerChangedObserve);
        this.mComboIconPageIndicator.setViewPager(this.mViewPager, i2);
        this.mComboIconPageIndicator.setOnPageChangeListener(this.mComboViewPagerChangedObserve);
        this.mViewPagerAdapter.h(genViews, arrayList2);
        this.mComboIconPageIndicator.notifyDataSetChanged();
    }

    private void setBackground(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{this, view, drawable});
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    private void setData(ComboResponse comboResponse) {
        ArrayList<ComboItemData> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2390bb24", new Object[]{this, comboResponse});
        } else if (comboResponse == null || comboResponse.getData() == null) {
            this.mErrorController.h(false);
        } else {
            ComboData data = comboResponse.getData();
            this.mComboData = data;
            ArrayList<Long> arrayList2 = data.mealIdList;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.mIsFirstRequset = false;
                n24.c().d(Long.valueOf(this.mComboData.mealId), comboResponse);
                ComboData comboData = this.mComboData;
                ArrayList<Long> arrayList3 = comboData.mealIdList;
                long j2 = comboData.mealId;
                i iVar = new i(this, arrayList3, j2);
                this.mComboIdManager = iVar;
                this.mPreLoadBusiness.startRequest(iVar.b(j2));
            }
            i iVar2 = this.mComboIdManager;
            if (iVar2 == null || iVar2.i() < 1 || (arrayList = this.mComboData.itemList) == null) {
                this.mErrorController.h(false);
                return;
            }
            this.mItemCount = arrayList.size();
            this.mComboIdManager.h(this.mComboData.mealId);
            freshTitle(this.mComboData.mealName, this.mComboIdManager.a());
            if (-1 != this.mFirstEntryItemId) {
                int size = this.mComboData.itemList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        i2 = 0;
                        break;
                    } else if (this.mFirstEntryItemId == this.mComboData.itemList.get(i2).itemId) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (this.mIsAddFavFromUnLogin) {
                    this.mIsAddFavFromUnLogin = false;
                    if (isLogin() && !this.mComboData.itemList.get(i2).isFavor) {
                        this.mFavCollectBusiness.c(2, this.mFirstEntryItemId);
                    }
                }
                this.mCurrentItemIndex = i2;
                setAdapterData(i2);
                setTopViewData(i2);
                this.mFirstEntryItemId = -1L;
            } else {
                this.mCurrentItemIndex = 0;
                setAdapterData(0);
                setTopViewData(0);
            }
            setButtomViewData();
        }
    }

    private void setFavImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2225aeb", new Object[]{this, new Boolean(z)});
        } else if (z) {
            setBackground(this.mFavoriteImg, getResourcesDrawable(R.drawable.shop_combo_favor));
        } else {
            setBackground(this.mFavoriteImg, getResourcesDrawable(R.drawable.shop_combo_no_favor));
        }
    }

    private void setTopViewData(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4bd5fa", new Object[]{this, new Integer(i2)});
            return;
        }
        ComboItemData comboItemData = this.mComboData.itemList.get(i2);
        this.mCurrentItemIndex = i2;
        ViewGroup.LayoutParams layoutParams = this.mItemName.getLayoutParams();
        layoutParams.width = ((frp.d() - ((RelativeLayout) this.mContext.findViewById(R.id.shop_combo_main_top_view)).getPaddingLeft()) - jbx.a(this.mContext.findViewById(R.id.shop_combo_main_top_item_right_layout))) - 5;
        this.mItemName.setLayoutParams(layoutParams);
        this.mItemName.setSingleLine(true);
        this.mItemName.setEllipsize(TextUtils.TruncateAt.END);
        this.mItemName.setText(comboItemData.itemName);
        this.mItemPrice.setTextColor(this.mContext.getResources().getColor(R.color.SC_A_C));
        this.mItemPrice.setPrice((float) (comboItemData.itemPrice / 100.0d));
        setFavImage(comboItemData.isFavor);
    }

    private void showProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83b03d1", new Object[]{this});
        } else {
            this.mProgressBar.setVisibility(0);
        }
    }

    private void showToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
            return;
        }
        Toast makeText = Toast.makeText(this.mContext, str, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    private void startRequest(long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eedc3964", new Object[]{this, new Long(j2), new Boolean(z)});
        } else if (j2 < 0) {
            this.mErrorController.h(false);
        } else {
            this.mErrorController.e();
            showProgress();
            this.mComboBusiness.b(1, j2, z);
        }
    }

    private void userTrack(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39292765", new Object[]{this, str, str2, str3});
        } else if (str != null && str2 != null && str3 != null) {
            TBS.Adv.ctrlClicked(CT.valueOf(str), str2, str3);
        }
    }

    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        n24.a();
        m24 m24Var = this.mComboBusiness;
        if (m24Var != null) {
            m24Var.destroy();
        }
        b29 b29Var = this.mFavCollectBusiness;
        if (b29Var != null) {
            b29Var.destroy();
        }
        PreLoadBusiness preLoadBusiness = this.mPreLoadBusiness;
        if (preLoadBusiness != null) {
            preLoadBusiness.destory();
        }
        ifw ifwVar = this.mViewPagerManager;
        if (ifwVar != null) {
            ifwVar.b();
        }
        this.mContext = null;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i2, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
        } else {
            errorProc(i2, mtopResponse, obj);
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        Properties properties = new Properties();
        properties.put("seller_id", Long.valueOf(this.mSellerId));
        this.mContext.l3(properties);
    }

    public void onResume() {
        ComboData comboData;
        ArrayList<ComboItemData> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (isLogin() && this.mFavCollectBusiness != null && (comboData = this.mComboData) != null && (arrayList = comboData.itemList) != null) {
            this.mFavCollectBusiness.b(4, arrayList.get(this.mCurrentItemIndex).itemId);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
        } else if (this.mContext != null) {
            if (i2 == 1) {
                this.mErrorController.e();
                hideProgress();
                if (baseOutDo == null || !(baseOutDo instanceof ComboResponse)) {
                    this.mErrorController.h(false);
                } else {
                    setData((ComboResponse) baseOutDo);
                }
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4 && (baseOutDo instanceof ComTaobaoMclFavCheckcollectResponse)) {
                        ComTaobaoMclFavCheckcollectResponseData data = ((ComTaobaoMclFavCheckcollectResponse) baseOutDo).getData();
                        Iterator<ComboItemData> it = this.mComboData.itemList.iterator();
                        while (it.hasNext()) {
                            ComboItemData next = it.next();
                            if (data.itemId == next.itemId) {
                                next.isFavor = data.isFav;
                                if (this.mCurrentItemIndex == this.mComboData.itemList.indexOf(next)) {
                                    setFavImage(next.isFavor);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } else if (obj instanceof Long) {
                    Long l2 = (Long) obj;
                    Iterator<ComboItemData> it2 = this.mComboData.itemList.iterator();
                    while (it2.hasNext()) {
                        ComboItemData next2 = it2.next();
                        if (l2.longValue() == next2.itemId) {
                            next2.isFavor = false;
                            crp.a("Page_ShopcollocationDetail", "Button", "CancleFavorite", this.commonUTStr + ",item_id=" + next2.itemId);
                            if (this.mCurrentItemIndex == this.mComboData.itemList.indexOf(next2)) {
                                setFavImage(next2.isFavor);
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (obj instanceof Long) {
                Long l3 = (Long) obj;
                Iterator<ComboItemData> it3 = this.mComboData.itemList.iterator();
                while (it3.hasNext()) {
                    ComboItemData next3 = it3.next();
                    if (l3.longValue() == next3.itemId) {
                        next3.isFavor = true;
                        crp.a("Page_ShopcollocationDetail", "Button", "AddToFavorite", this.commonUTStr + ",item_id=" + next3.itemId);
                        if (this.mCurrentItemIndex == this.mComboData.itemList.indexOf(next3)) {
                            setFavImage(next3.isFavor);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
        } else {
            errorProc(i2, mtopResponse, obj);
        }
    }

    private void setButtomViewData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952ad6c9", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.mComboData.type != null) {
            this.mLayout.removeAllViews();
            if (this.mComboData.type.equals(hq9.TMALL)) {
                this.mLayout.addView(this.mSavePrice);
                this.mLayout.addView(this.mComboPrice);
                long j2 = this.mComboData.savedMoney;
                if (0 == j2) {
                    this.mComboPrice.setText("");
                    sb.delete(0, sb.length());
                    sb.append("");
                } else {
                    this.mComboPrice.setPrice((float) (j2 / 100.0d));
                    sb.delete(0, sb.length());
                    sb.append(getResourcesString(R.string.combo_save_price));
                }
            } else if (this.mComboData.type.equals("taobao")) {
                this.mLayout.addView(this.mComboPrice);
                this.mLayout.addView(this.mSavePrice);
                this.mComboPrice.setPrice((float) (this.mComboData.mealPrice / 100.0d));
                long j3 = this.mComboData.savedMoney;
                sb.delete(0, sb.length());
                if (0 == j3) {
                    sb.append("");
                } else {
                    int i2 = (int) ((j3 % 100) / 10);
                    int i3 = (int) (j3 % 10);
                    sb.append(getResourcesString(R.string.combo_save));
                    sb.append(j3 / 100);
                    if (!(i2 == 0 && i3 == 0)) {
                        sb.append(getResourcesString(R.string.shop_dot));
                        String str2 = "0";
                        if (i2 == 0) {
                            str = str2;
                        } else {
                            str = i2 + "";
                        }
                        sb.append(str);
                        if (i3 != 0) {
                            str2 = i3 + "";
                        }
                        sb.append(str2);
                    }
                    sb.append(getResourcesString(R.string.combo_money_unit));
                }
            }
            this.mLayout.addView(this.mBuyBtn);
            this.mLayout.invalidate();
        }
        this.mSavePrice.setText(sb.toString());
    }
}
