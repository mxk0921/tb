package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.mtop.LiveInfoItem;
import com.taobao.taolive.uikit.mtop.SimpleAccountInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.s0m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoliveBigcardTopView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private TextView mLocNameView;
    private TUrlImageView mShopImage;
    private TextView mShopLogo;
    private TextView mShopName;
    private TUrlImageView mTaoShopImg;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TaoliveBigcardTopView taoliveBigcardTopView) {
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null || succPhenixEvent.getDrawable() == null) {
                return false;
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            TaoliveBigcardTopView.access$000(TaoliveBigcardTopView.this).setImageDrawable(drawable);
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            ViewGroup.LayoutParams layoutParams = TaoliveBigcardTopView.access$000(TaoliveBigcardTopView.this).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (intrinsicWidth * 32) / intrinsicHeight;
                TaoliveBigcardTopView.access$000(TaoliveBigcardTopView.this).setLayoutParams(layoutParams);
            }
            return true;
        }
    }

    static {
        t2o.a(779093708);
    }

    public TaoliveBigcardTopView(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    public static /* synthetic */ TUrlImageView access$000(TaoliveBigcardTopView taoliveBigcardTopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("ae243ee1", new Object[]{taoliveBigcardTopView});
        }
        return taoliveBigcardTopView.mTaoShopImg;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LayoutInflater.from(this.mContext).inflate(R.layout.tbliveuikit_big_card_top_part, this);
        this.mShopImage = (TUrlImageView) findViewById(R.id.taolive_shop_icon);
        this.mShopName = (TextView) findViewById(R.id.taolive_shop_name);
        this.mTaoShopImg = (TUrlImageView) findViewById(R.id.taolive_shop_hg_img);
        this.mLocNameView = (TextView) findViewById(R.id.taolive_shop_loc_view);
        this.mShopLogo = (TextView) findViewById(R.id.taolive_shop_logo);
    }

    public static /* synthetic */ Object ipc$super(TaoliveBigcardTopView taoliveBigcardTopView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TaoliveBigcardTopView");
    }

    public void setData(LiveInfoItem liveInfoItem) {
        SimpleAccountInfo simpleAccountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9498f6af", new Object[]{this, liveInfoItem});
        } else if (liveInfoItem != null && (simpleAccountInfo = liveInfoItem.accountDO) != null) {
            this.mShopImage.setImageUrl(simpleAccountInfo.headImg);
            this.mShopName.setText(simpleAccountInfo.accountNick);
            this.mShopLogo.setText(simpleAccountInfo.shopLogoTxt);
            this.mShopLogo.setVisibility(8);
            if (!TextUtils.isEmpty(simpleAccountInfo.levelLogo)) {
                s0m.B().T(simpleAccountInfo.levelLogo).succListener(new b()).failListener(new a(this)).fetch();
            }
            String str = liveInfoItem.location;
            if (!"true".equals(liveInfoItem.connectLocation) || TextUtils.isEmpty(str)) {
                this.mLocNameView.setVisibility(8);
                return;
            }
            TextView textView = this.mLocNameView;
            textView.setText(" | " + this.mContext.getString(R.string.tbliveuikit_video_item_location, str));
            this.mLocNameView.setVisibility(0);
        }
    }

    public TaoliveBigcardTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        init();
    }

    public TaoliveBigcardTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        init();
    }
}
