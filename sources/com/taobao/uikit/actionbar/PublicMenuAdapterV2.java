package com.taobao.uikit.actionbar;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.util.Tools;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.iy4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PublicMenuAdapterV2 extends RecyclerView.Adapter<MenuItemViewHolder> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<TBPublicMenuItem> dataSet;
    private RecyclerView.OnScrollListener onScrollListener;
    private boolean mIsTileLayout = false;
    private List<TBPublicMenu.TBOnPublicMenuClickListener> customizeListeners = new ArrayList();
    private List<TBPublicMenu.TBOnPublicMenuClickListener> menuListeners = new ArrayList();
    private TBPublicMenuItemObserver mObserver = null;
    private ItemAction itemAction = null;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.actionbar.PublicMenuAdapterV2$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode;

        static {
            int[] iArr = new int[TBPublicMenuItem.MessageMode.values().length];
            $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode = iArr;
            try {
                iArr[TBPublicMenuItem.MessageMode.DOT_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.DOT_WITH_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.IMG_TIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class GlobalizationMenuItemViewHolder extends MenuItemViewHolder {
        static {
            t2o.a(927989781);
        }

        public GlobalizationMenuItemViewHolder(View view) {
            super(view);
            TextView textView = this.mTitleView;
            if (textView != null) {
                textView.setLines(2);
                this.mTitleView.setSingleLine(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.mTitleView.setBreakStrategy(1);
                    this.mTitleView.setHyphenationFrequency(0);
                }
                this.mTitleView.setTextSize(1, 10.0f);
                this.mTitleView.setGravity(49);
            }
            this.mDefaultWeight = (int) view.getResources().getDimension(R.dimen.uik_public_menu_item_i18n_width);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ItemAction {
        void onItemExposure(TBPublicMenuItem tBPublicMenuItem);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MenuItemViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mDefaultHeight;
        public int mDefaultWeight;
        public TUrlImageView mIconImageView;
        public TIconFontTextView mIconView;
        public TUrlImageView mMessageImg;
        public TextView mMessageView;
        public TextView mTitleView;

        static {
            t2o.a(927989783);
        }

        public MenuItemViewHolder(View view) {
            super(view);
            this.mDefaultHeight = -1;
            this.mDefaultWeight = -1;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mDefaultHeight = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            this.mDefaultWeight = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            this.mIconView = (TIconFontTextView) view.findViewById(R.id.uik_public_menu_item_icon);
            TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.uik_public_menu_item_image);
            this.mIconImageView = tUrlImageView;
            tUrlImageView.setPhenixOptions(new PhenixOptions().bitmapProcessors(new iy4()));
            this.mTitleView = (TextView) view.findViewById(R.id.uik_public_menu_item_title);
            this.mMessageView = (TextView) view.findViewById(R.id.uik_public_menu_item_message);
            this.mMessageImg = (TUrlImageView) view.findViewById(R.id.uik_public_menu_item_message_img);
        }

        public static /* synthetic */ Object ipc$super(MenuItemViewHolder menuItemViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/PublicMenuAdapterV2$MenuItemViewHolder");
        }

        public void setVisibility(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
                return;
            }
            this.itemView.setVisibility(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
            if (i == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = this.mDefaultHeight;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = this.mDefaultWeight;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
            }
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnItemClickListener {
        void onItemClick(TBPublicMenuItem tBPublicMenuItem);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SpacesItemDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mIsTileLayout = false;
        private final Resources mResources;

        static {
            t2o.a(927989785);
        }

        public SpacesItemDecoration(Resources resources) {
            this.mResources = resources;
        }

        public static /* synthetic */ Object ipc$super(SpacesItemDecoration spacesItemDecoration, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/PublicMenuAdapterV2$SpacesItemDecoration");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            } else if (this.mIsTileLayout) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int width = recyclerView.getWidth();
                if (width <= 0) {
                    width = view.getResources().getDisplayMetrics().widthPixels;
                }
                int i = width / 5;
                int i2 = layoutParams.width;
                if (i < i2) {
                    rect.left = 0;
                    rect.right = 0;
                    return;
                }
                int i3 = (i - i2) / 2;
                rect.left = i3;
                rect.right = i3;
            } else if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = Tools.dp2Px(this.mResources, 6.0f);
            }
        }

        public void setIsTileLayout(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39cbafe9", new Object[]{this, new Boolean(z)});
            } else {
                this.mIsTileLayout = z;
            }
        }
    }

    static {
        t2o.a(927989778);
    }

    public static /* synthetic */ List access$000(PublicMenuAdapterV2 publicMenuAdapterV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82747912", new Object[]{publicMenuAdapterV2});
        }
        return publicMenuAdapterV2.dataSet;
    }

    private void bindObserverToItems(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb80feca", new Object[]{this, list});
            return;
        }
        if (this.mObserver == null) {
            this.mObserver = new TBPublicMenuItemObserver() { // from class: com.taobao.uikit.actionbar.PublicMenuAdapterV2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenuItemObserver
                public void onItemDataChanged(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a1f93487", new Object[]{this, tBPublicMenuItem});
                    } else if (PublicMenuAdapterV2.access$000(PublicMenuAdapterV2.this).contains(tBPublicMenuItem)) {
                        PublicMenuAdapterV2.this.notifyDataSetChanged();
                    }
                }
            };
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            if (!tBPublicMenuItem.isAddByUikit()) {
                tBPublicMenuItem.setDataChangeObserver(this.mObserver);
            }
        }
    }

    private int getTextViewLeftMarginId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2276ec12", new Object[]{this})).intValue();
        }
        if (Localization.o()) {
            return R.dimen.uik_public_menu_message_margin_left_I18n;
        }
        return R.dimen.uik_public_menu_message_margin_left;
    }

    public static /* synthetic */ Object ipc$super(PublicMenuAdapterV2 publicMenuAdapterV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/PublicMenuAdapterV2");
    }

    public void addCustomizeCLickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e221a235", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.customizeListeners.add(tBOnPublicMenuClickListener);
        }
    }

    public void addOnItemCLickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bda2466", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.menuListeners.add(tBOnPublicMenuClickListener);
        }
    }

    public void clearCustomizeClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af594db4", new Object[]{this});
        } else {
            this.customizeListeners.clear();
        }
    }

    public void clearOnItemClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e614fb3d", new Object[]{this});
        } else {
            this.menuListeners.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<TBPublicMenuItem> list = this.dataSet;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public RecyclerView.OnScrollListener getOnScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("3014c82e", new Object[]{this});
        }
        return this.onScrollListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        UTWrapper.closeByButton = true;
        for (TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener : this.menuListeners) {
            tBOnPublicMenuClickListener.onPublicMenuItemClicked((TBPublicMenuItem) view.getTag());
        }
        for (TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener2 : this.customizeListeners) {
            tBOnPublicMenuClickListener2.onPublicMenuItemClicked((TBPublicMenuItem) view.getTag());
        }
    }

    public void removeAllExternalObservers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9949dc", new Object[]{this});
            return;
        }
        List<TBPublicMenuItem> list = this.dataSet;
        if (list != null) {
            for (TBPublicMenuItem tBPublicMenuItem : list) {
                tBPublicMenuItem.resetDataChangeObserver();
            }
        }
    }

    public void setDataSet(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5f420e", new Object[]{this, list});
        } else if (list != null) {
            this.dataSet = list;
            notifyDataSetChanged();
        }
    }

    public void setItemAction(ItemAction itemAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b767b3", new Object[]{this, itemAction});
        } else {
            this.itemAction = itemAction;
        }
    }

    public void setLayoutMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b0929e", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsTileLayout = z;
        }
    }

    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3771abe", new Object[]{this, onScrollListener});
        } else {
            this.onScrollListener = onScrollListener;
        }
    }

    public void onBindViewHolder(MenuItemViewHolder menuItemViewHolder, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae0e4c", new Object[]{this, menuItemViewHolder, new Integer(i)});
            return;
        }
        TBPublicMenuItem tBPublicMenuItem = i < this.dataSet.size() ? this.dataSet.get(i) : null;
        menuItemViewHolder.itemView.setTag(tBPublicMenuItem);
        if (tBPublicMenuItem != null) {
            if (tBPublicMenuItem.isVisible()) {
                ItemAction itemAction = this.itemAction;
                if (itemAction != null) {
                    itemAction.onItemExposure(tBPublicMenuItem);
                }
                menuItemViewHolder.setVisibility(0);
            } else {
                menuItemViewHolder.setVisibility(8);
            }
            if (!TextUtils.isEmpty(tBPublicMenuItem.mIconUrl)) {
                menuItemViewHolder.mIconView.setVisibility(8);
                menuItemViewHolder.mIconImageView.setVisibility(0);
                menuItemViewHolder.mIconImageView.setImageDrawable(null);
                menuItemViewHolder.mIconImageView.setImageUrl(tBPublicMenuItem.mIconUrl);
                menuItemViewHolder.mIconView.setText("");
            } else if (tBPublicMenuItem.mIconDrawable != null) {
                menuItemViewHolder.mIconView.setVisibility(8);
                menuItemViewHolder.mIconImageView.setVisibility(0);
                menuItemViewHolder.mIconImageView.setImageDrawable(tBPublicMenuItem.mIconDrawable);
                menuItemViewHolder.mIconView.setText("");
            } else if (!TextUtils.isEmpty(tBPublicMenuItem.mTitle)) {
                menuItemViewHolder.mIconView.setVisibility(0);
                menuItemViewHolder.mIconImageView.setVisibility(8);
                if (tBPublicMenuItem.getTitle().length() < 2 || tBPublicMenuItem.getTitle().charAt(1) != ':') {
                    menuItemViewHolder.mIconView.setText("");
                } else {
                    menuItemViewHolder.mIconView.setText(tBPublicMenuItem.getTitle().substring(0, tBPublicMenuItem.getTitle().indexOf(":")));
                }
                menuItemViewHolder.mIconImageView.setImageDrawable(null);
                menuItemViewHolder.mIconView.setVisibility(0);
                menuItemViewHolder.mIconImageView.setVisibility(8);
            } else {
                menuItemViewHolder.mIconImageView.setImageDrawable(null);
                menuItemViewHolder.mIconView.setText("");
            }
            menuItemViewHolder.mIconView.invalidate();
            menuItemViewHolder.mIconImageView.invalidate();
            if (!TextUtils.isEmpty(tBPublicMenuItem.getTitle())) {
                int length = tBPublicMenuItem.getTitle().length();
                if (length < 2 || tBPublicMenuItem.getTitle().charAt(1) != ':') {
                    str = tBPublicMenuItem.getTitle();
                } else {
                    str = tBPublicMenuItem.getTitle().substring(2, length);
                }
                menuItemViewHolder.mTitleView.setText(str);
            } else {
                menuItemViewHolder.mTitleView.setText("");
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) menuItemViewHolder.mMessageView.getLayoutParams();
            if (tBPublicMenuItem.getMessageMode() == null) {
                menuItemViewHolder.mMessageView.setText("");
                menuItemViewHolder.mMessageView.setVisibility(8);
                menuItemViewHolder.mMessageImg.setVisibility(8);
                return;
            }
            int i2 = AnonymousClass2.$SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[tBPublicMenuItem.getMessageMode().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    try {
                        int intValue = Integer.valueOf(tBPublicMenuItem.mMessage).intValue();
                        if (intValue > 99) {
                            menuItemViewHolder.mMessageView.setVisibility(0);
                            menuItemViewHolder.mMessageImg.setVisibility(8);
                            if (Build.MANUFACTURER.equals("Xiaomi")) {
                                menuItemViewHolder.mMessageView.setText("•••");
                            } else {
                                menuItemViewHolder.mMessageView.setText("···");
                            }
                            menuItemViewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_more_bg);
                            layoutParams.height = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                            layoutParams.width = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_two_width);
                            layoutParams.leftMargin = (int) menuItemViewHolder.itemView.getResources().getDimension(getTextViewLeftMarginId());
                            menuItemViewHolder.mMessageView.setLayoutParams(layoutParams);
                        } else if (intValue >= 10) {
                            menuItemViewHolder.mMessageImg.setVisibility(8);
                            menuItemViewHolder.mMessageView.setVisibility(0);
                            menuItemViewHolder.mMessageView.setText(String.valueOf(intValue));
                            menuItemViewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_more_bg);
                            layoutParams.height = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                            layoutParams.width = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_two_width);
                            layoutParams.leftMargin = (int) menuItemViewHolder.itemView.getResources().getDimension(getTextViewLeftMarginId());
                            menuItemViewHolder.mMessageView.setLayoutParams(layoutParams);
                        } else if (intValue > 0) {
                            menuItemViewHolder.mMessageImg.setVisibility(8);
                            menuItemViewHolder.mMessageView.setVisibility(0);
                            menuItemViewHolder.mMessageView.setText(String.valueOf(intValue));
                            menuItemViewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_dot_bg);
                            layoutParams.height = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                            layoutParams.width = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_width);
                            layoutParams.leftMargin = (int) menuItemViewHolder.itemView.getResources().getDimension(getTextViewLeftMarginId());
                            menuItemViewHolder.mMessageView.setLayoutParams(layoutParams);
                        } else {
                            menuItemViewHolder.mMessageView.setVisibility(8);
                            menuItemViewHolder.mMessageImg.setVisibility(8);
                        }
                    } catch (NumberFormatException unused) {
                        menuItemViewHolder.mMessageView.setText("");
                        menuItemViewHolder.mMessageView.setVisibility(8);
                        menuItemViewHolder.mMessageImg.setVisibility(8);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        menuItemViewHolder.mMessageImg.setVisibility(0);
                        if (tBPublicMenuItem.getImageTipUri() != null && !tBPublicMenuItem.getImageTipUri().isEmpty()) {
                            menuItemViewHolder.mMessageImg.setImageDrawable(null);
                            menuItemViewHolder.mMessageImg.setImageUrl(tBPublicMenuItem.getImageTipUri());
                        }
                        menuItemViewHolder.mMessageView.setText("");
                        menuItemViewHolder.mMessageView.setVisibility(8);
                    } else if (i2 != 5) {
                        menuItemViewHolder.mMessageImg.setVisibility(8);
                        menuItemViewHolder.mMessageView.setText("");
                        menuItemViewHolder.mMessageView.setVisibility(8);
                    } else {
                        menuItemViewHolder.mMessageImg.setVisibility(8);
                        menuItemViewHolder.mMessageView.setText("");
                        menuItemViewHolder.mMessageView.setVisibility(8);
                    }
                } else if (!TextUtils.isEmpty(tBPublicMenuItem.mMessage)) {
                    menuItemViewHolder.mMessageImg.setVisibility(8);
                    menuItemViewHolder.mMessageView.setVisibility(0);
                    menuItemViewHolder.mMessageView.setText(tBPublicMenuItem.mMessage);
                    menuItemViewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_more_bg);
                    layoutParams.height = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                    layoutParams.width = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_text_width);
                    layoutParams.leftMargin = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_text_margin_left);
                    menuItemViewHolder.mMessageView.setLayoutParams(layoutParams);
                    menuItemViewHolder.mMessageView.setVisibility(0);
                } else {
                    menuItemViewHolder.mMessageView.setText("");
                    menuItemViewHolder.mMessageView.setVisibility(8);
                    menuItemViewHolder.mMessageImg.setVisibility(8);
                }
            } else if (!TextUtils.isEmpty(tBPublicMenuItem.mMessage) && !"0".equals(tBPublicMenuItem.mMessage)) {
                menuItemViewHolder.mMessageView.setVisibility(0);
                menuItemViewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_dot_bg);
                menuItemViewHolder.mMessageImg.setVisibility(8);
                layoutParams.height = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_dot_height);
                layoutParams.width = (int) menuItemViewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_dot_width);
                layoutParams.leftMargin = (int) menuItemViewHolder.itemView.getResources().getDimension(getTextViewLeftMarginId());
                menuItemViewHolder.mMessageView.setLayoutParams(layoutParams);
                menuItemViewHolder.mMessageView.setText("");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MenuItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MenuItemViewHolder menuItemViewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItemViewHolder) ipChange.ipc$dispatch("3ac0a6cc", new Object[]{this, viewGroup, new Integer(i)});
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uik_public_menu_panel_item, viewGroup, false);
        if (Localization.o()) {
            menuItemViewHolder = new GlobalizationMenuItemViewHolder(inflate);
        } else {
            menuItemViewHolder = new MenuItemViewHolder(inflate);
        }
        ViewProxy.setOnClickListener(inflate, this);
        return menuItemViewHolder;
    }

    public void setDataSet(List<TBPublicMenuItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89b286", new Object[]{this, list, new Boolean(z)});
            return;
        }
        if (list != null) {
            this.dataSet = list;
            notifyDataSetChanged();
        }
        if (z) {
            bindObserverToItems(list);
        }
    }
}
