package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.ChatMenuPopupWindow;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.cnb;
import tb.hw0;
import tb.nh4;
import tb.t2o;
import tb.x6k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ChatMenuPopupWindow extends PopupWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout mContainer1;
    private FrameLayout mContainer2;
    private FrameLayout mContainer3;
    private final Context mContext;
    private TUrlImageView mImageView1;
    private TUrlImageView mImageView2;
    private TUrlImageView mImageView3;
    private cnb mListener;
    private LinearLayout mPopContainerBg;
    private View mRootView;
    private final List<ChatMenuItem> mSourceList;
    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TUrlImageView mTriangleImageView;

    static {
        t2o.a(295698577);
    }

    public ChatMenuPopupWindow(Context context, List<ChatMenuItem> list) {
        super(context);
        this.mContext = context;
        this.mSourceList = list;
        setupConfig();
    }

    private Drawable getBgDrawable(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("813823a8", new Object[]{this, view});
        }
        if (nh4.v()) {
            return view.getResources().getDrawable(R.drawable.taolive_chat_menu_background_denoise_flexalocal);
        }
        return view.getResources().getDrawable(R.drawable.taolive_chat_menu_background_flexalocal);
    }

    private void initItemConfig(View view, final ChatMenuItem chatMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5354eea9", new Object[]{this, view, chatMenuItem});
        } else {
            ViewProxy.setOnClickListener(view, new View.OnClickListener() { // from class: tb.in3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatMenuPopupWindow.this.lambda$initItemConfig$31(chatMenuItem, view2);
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(ChatMenuPopupWindow chatMenuPopupWindow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/menu/ChatMenuPopupWindow");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initItemConfig$31(ChatMenuItem chatMenuItem, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c5e40a", new Object[]{this, chatMenuItem, view});
            return;
        }
        dismiss();
        cnb cnbVar = this.mListener;
        if (cnbVar != null) {
            ((x6k) cnbVar).a(chatMenuItem);
        }
    }

    private void refreshData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf67b2c", new Object[]{this});
            return;
        }
        List<ChatMenuItem> list = this.mSourceList;
        if (list == null || list.size() != 1) {
            List<ChatMenuItem> list2 = this.mSourceList;
            if (list2 == null || list2.size() != 3) {
                List<ChatMenuItem> list3 = this.mSourceList;
                if (list3 != null && list3.size() == 2) {
                    ChatMenuItem chatMenuItem = this.mSourceList.get(0);
                    initItemConfig(this.mContainer1, chatMenuItem);
                    ChatMenuItem chatMenuItem2 = this.mSourceList.get(1);
                    initItemConfig(this.mContainer2, chatMenuItem2);
                    if (chatMenuItem != null) {
                        this.mImageView1.setImageUrl(chatMenuItem.icon);
                        this.mTextView1.setText(chatMenuItem.text);
                    }
                    if (chatMenuItem2 != null) {
                        this.mImageView2.setImageUrl(chatMenuItem2.icon);
                        this.mTextView2.setText(chatMenuItem2.text);
                    }
                    this.mContainer3.setVisibility(8);
                    return;
                }
                return;
            }
            ChatMenuItem chatMenuItem3 = this.mSourceList.get(0);
            initItemConfig(this.mContainer1, chatMenuItem3);
            ChatMenuItem chatMenuItem4 = this.mSourceList.get(1);
            initItemConfig(this.mContainer2, chatMenuItem4);
            ChatMenuItem chatMenuItem5 = this.mSourceList.get(2);
            initItemConfig(this.mContainer3, chatMenuItem5);
            if (chatMenuItem3 != null) {
                this.mImageView1.setImageUrl(chatMenuItem3.icon);
                this.mTextView1.setText(chatMenuItem3.text);
            }
            if (chatMenuItem4 != null) {
                this.mImageView2.setImageUrl(chatMenuItem4.icon);
                this.mTextView2.setText(chatMenuItem4.text);
            }
            if (chatMenuItem5 != null) {
                this.mImageView3.setImageUrl(chatMenuItem5.icon);
                this.mTextView3.setText(chatMenuItem5.text);
                return;
            }
            return;
        }
        this.mContainer2.setVisibility(8);
        this.mContainer3.setVisibility(8);
        ChatMenuItem chatMenuItem6 = this.mSourceList.get(0);
        initItemConfig(this.mContainer1, chatMenuItem6);
        if (chatMenuItem6 != null) {
            this.mImageView1.setImageUrl(chatMenuItem6.icon);
            this.mTextView1.setText(chatMenuItem6.text);
        }
    }

    private void setupConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfe7526", new Object[]{this});
            return;
        }
        setClippingEnabled(true);
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.layout_popup_window_chat_behavior_flexalocal, (ViewGroup) null);
        this.mRootView = inflate;
        setupData(inflate);
        setContentView(this.mRootView);
    }

    private void setupData(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607dd944", new Object[]{this, view});
            return;
        }
        this.mContainer1 = (FrameLayout) view.findViewById(R.id.chat_menu_item_container1);
        this.mContainer2 = (FrameLayout) view.findViewById(R.id.chat_menu_item_container2);
        this.mContainer3 = (FrameLayout) view.findViewById(R.id.chat_menu_item_container3);
        this.mImageView1 = (TUrlImageView) view.findViewById(R.id.chat_menu_item_image1);
        this.mImageView2 = (TUrlImageView) view.findViewById(R.id.chat_menu_item_image2);
        this.mImageView3 = (TUrlImageView) view.findViewById(R.id.chat_menu_item_image3);
        this.mTextView1 = (TextView) view.findViewById(R.id.chat_menu_item_tv1);
        this.mTextView2 = (TextView) view.findViewById(R.id.chat_menu_item_tv2);
        this.mTextView3 = (TextView) view.findViewById(R.id.chat_menu_item_tv3);
        this.mTriangleImageView = (TUrlImageView) view.findViewById(R.id.chat_menu_bottom_triangle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.taolive_chat_menu_bg);
        this.mPopContainerBg = linearLayout;
        linearLayout.setBackground(getBgDrawable(view));
        if (nh4.v()) {
            str = "https://gw.alicdn.com/imgextra/i3/O1CN01mLaA281CSEKgT5Pe2_!!6000000000079-2-tps-32-12.png";
        } else {
            str = "https://img.alicdn.com/imgextra/i3/O1CN01TJA3YE1dRlNe1hswB_!!6000000003733-2-tps-24-9.png";
        }
        this.mTriangleImageView.setImageUrl(str);
        List<ChatMenuItem> list = this.mSourceList;
        if (list != null && !list.isEmpty()) {
            refreshData();
        }
    }

    public void setChatItemClickListener(cnb cnbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c782189b", new Object[]{this, cnbVar});
        } else {
            this.mListener = cnbVar;
        }
    }

    public void showAtTopCenter(View view) {
        int i;
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43700bd1", new Object[]{this, view});
            return;
        }
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable((Resources) null, (Bitmap) null));
        setOutsideTouchable(true);
        this.mRootView.measure(0, 0);
        int measuredWidth = this.mRootView.getMeasuredWidth();
        int measuredHeight = this.mRootView.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2);
        if (width < hw0.b(this.mContext, 12.0f)) {
            i = hw0.b(this.mContext, 12.0f) - width;
            width = hw0.b(this.mContext, 12.0f);
        } else {
            i = 0;
        }
        showAtLocation(view, 0, width, iArr[1] - measuredHeight);
        if (i > 0 && (tUrlImageView = this.mTriangleImageView) != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tUrlImageView.getLayoutParams();
            layoutParams.leftMargin -= i;
            this.mTriangleImageView.setLayoutParams(layoutParams);
        }
    }
}
