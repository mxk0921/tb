package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final View mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    public final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    public final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    public final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    public int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    public boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    public final DataSetObserver mModelDataSetObserver;
    public PopupWindow.OnDismissListener mOnDismissListener;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    public ActionProvider mProvider;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ActivityChooserViewAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount = 4;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;

        public ActivityChooserViewAdapter() {
        }

        public static /* synthetic */ Object ipc$super(ActivityChooserViewAdapter activityChooserViewAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/ActivityChooserView$ActivityChooserViewAdapter");
        }

        public int getActivityCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("48e96b04", new Object[]{this})).intValue();
            }
            return this.mDataModel.getActivityCount();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            int activityCount = this.mDataModel.getActivityCount();
            if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                activityCount--;
            }
            int min = Math.min(activityCount, this.mMaxActivityCount);
            if (this.mShowFooterView) {
                return min + 1;
            }
            return min;
        }

        public ActivityChooserModel getDataModel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityChooserModel) ipChange.ipc$dispatch("32e615bf", new Object[]{this});
            }
            return this.mDataModel;
        }

        public ResolveInfo getDefaultActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResolveInfo) ipChange.ipc$dispatch("68afa3e6", new Object[]{this});
            }
            return this.mDataModel.getDefaultActivity();
        }

        public int getHistorySize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4d51c279", new Object[]{this})).intValue();
            }
            return this.mDataModel.getHistorySize();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                    i++;
                }
                return this.mDataModel.getActivity(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            if (!this.mShowFooterView || i != getCount() - 1) {
                return 0;
            }
            return 1;
        }

        public boolean getShowDefaultActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("90f31a88", new Object[]{this})).booleanValue();
            }
            return this.mShowDefaultActivity;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.mShowDefaultActivity || i != 0 || !this.mHighlightDefaultActivity) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(R.id.title)).setText(ActivityChooserView.this.getContext().getString(R.string.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
            }
            return 3;
        }

        public int measureContentWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("214eb045", new Object[]{this})).intValue();
            }
            int i = this.mMaxActivityCount;
            this.mMaxActivityCount = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.mMaxActivityCount = i;
            return i2;
        }

        public void setDataModel(ActivityChooserModel activityChooserModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b088cbd", new Object[]{this, activityChooserModel});
                return;
            }
            ActivityChooserModel dataModel = ActivityChooserView.this.mAdapter.getDataModel();
            if (dataModel != null && ActivityChooserView.this.isShown()) {
                dataModel.unregisterObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            this.mDataModel = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            notifyDataSetChanged();
        }

        public void setMaxActivityCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93badd5e", new Object[]{this, new Integer(i)});
            } else if (this.mMaxActivityCount != i) {
                this.mMaxActivityCount = i;
                notifyDataSetChanged();
            }
        }

        public void setShowDefaultActivity(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a793c78", new Object[]{this, new Boolean(z), new Boolean(z2)});
            } else if (this.mShowDefaultActivity != z || this.mHighlightDefaultActivity != z2) {
                this.mShowDefaultActivity = z;
                this.mHighlightDefaultActivity = z2;
                notifyDataSetChanged();
            }
        }

        public void setShowFooterView(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bff96bce", new Object[]{this, new Boolean(z)});
            } else if (this.mShowFooterView != z) {
                this.mShowFooterView = z;
                notifyDataSetChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Callbacks() {
        }

        private void notifyOnDismissListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4efebd", new Object[]{this});
                return;
            }
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.mOnDismissListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.mDefaultActivityButton) {
                activityChooserView.dismissPopup();
                Intent chooseActivity = ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(ActivityChooserView.this.mAdapter.getDataModel().getActivityIndex(ActivityChooserView.this.mAdapter.getDefaultActivity()));
                if (chooseActivity != null) {
                    chooseActivity.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(chooseActivity);
                }
            } else if (view == activityChooserView.mExpandActivityOverflowButton) {
                activityChooserView.mIsSelectingDefaultActivity = false;
                activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                return;
            }
            notifyOnDismissListener();
            ActionProvider actionProvider = ActivityChooserView.this.mProvider;
            if (actionProvider != null) {
                actionProvider.subUiVisibilityChanged(false);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.mDefaultActivityButton) {
                if (activityChooserView.mAdapter.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.mIsSelectingDefaultActivity = true;
                    activityChooserView2.showPopupUnchecked(activityChooserView2.mInitialActivityCount);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                return;
            }
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.dismissPopup();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.mIsSelectingDefaultActivity) {
                    if (!activityChooserView.mAdapter.getShowDefaultActivity()) {
                        i++;
                    }
                    Intent chooseActivity = ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(i);
                    if (chooseActivity != null) {
                        chooseActivity.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(chooseActivity);
                    }
                } else if (i > 0) {
                    activityChooserView.mAdapter.getDataModel().setDefaultActivity(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.showPopupUnchecked(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InnerLayout extends LinearLayout {
        private static final int[] TINT_ATTRS = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS);
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            obtainStyledAttributes.recycle();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(ActivityChooserView activityChooserView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/appcompat/widget/ActivityChooserView");
        }
    }

    public boolean dismissPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16a167cd", new Object[]{this})).booleanValue();
        }
        if (isShowingPopup()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
            }
        }
        return true;
    }

    public ActivityChooserModel getDataModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityChooserModel) ipChange.ipc$dispatch("32e615bf", new Object[]{this});
        }
        return this.mAdapter.getDataModel();
    }

    public ListPopupWindow getListPopupWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListPopupWindow) ipChange.ipc$dispatch("9655d2bb", new Object[]{this});
        }
        if (this.mListPopupWindow == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.mListPopupWindow = listPopupWindow;
            listPopupWindow.setAdapter(this.mAdapter);
            this.mListPopupWindow.setAnchorView(this);
            this.mListPopupWindow.setModal(true);
            this.mListPopupWindow.setOnItemClickListener(this.mCallbacks);
            this.mListPopupWindow.setOnDismissListener(this.mCallbacks);
        }
        return this.mListPopupWindow;
    }

    public boolean isShowingPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf90a3c", new Object[]{this})).booleanValue();
        }
        return getListPopupWindow().isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.registerObserver(this.mModelDataSetObserver);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.unregisterObserver(this.mModelDataSetObserver);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        View view = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db5873f", new Object[]{this, activityChooserModel});
            return;
        }
        this.mAdapter.setDataModel(activityChooserModel);
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db65d52", new Object[]{this, new Integer(i)});
        } else {
            this.mDefaultActionButtonContentDescription = i;
        }
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf25cfa", new Object[]{this, new Integer(i)});
        } else {
            this.mExpandActivityOverflowButtonImage.setContentDescription(getContext().getString(i));
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ddfe068", new Object[]{this, drawable});
        } else {
            this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
        }
    }

    public void setInitialActivityCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e059483e", new Object[]{this, new Integer(i)});
        } else {
            this.mInitialActivityCount = i;
        }
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51c1bc7", new Object[]{this, onDismissListener});
        } else {
            this.mOnDismissListener = onDismissListener;
        }
    }

    public void setProvider(ActionProvider actionProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87039260", new Object[]{this, actionProvider});
        } else {
            this.mProvider = actionProvider;
        }
    }

    public boolean showPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4fa10ba", new Object[]{this})).booleanValue();
        }
        if (isShowingPopup() || !this.mIsAttachedToWindow) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }

    public void updateAppearance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53be014", new Object[]{this});
            return;
        }
        if (this.mAdapter.getCount() > 0) {
            this.mExpandActivityOverflowButton.setEnabled(true);
        } else {
            this.mExpandActivityOverflowButton.setEnabled(false);
        }
        int activityCount = this.mAdapter.getActivityCount();
        int historySize = this.mAdapter.getHistorySize();
        if (activityCount == 1 || (activityCount > 1 && historySize > 0)) {
            this.mDefaultActivityButton.setVisibility(0);
            ResolveInfo defaultActivity = this.mAdapter.getDefaultActivity();
            PackageManager packageManager = getContext().getPackageManager();
            this.mDefaultActivityButtonImage.setImageDrawable(defaultActivity.loadIcon(packageManager));
            if (this.mDefaultActionButtonContentDescription != 0) {
                this.mDefaultActivityButton.setContentDescription(getContext().getString(this.mDefaultActionButtonContentDescription, defaultActivity.loadLabel(packageManager)));
            }
        } else {
            this.mDefaultActivityButton.setVisibility(8);
        }
        if (this.mDefaultActivityButton.getVisibility() == 0) {
            this.mActivityChooserContent.setBackgroundDrawable(this.mActivityChooserContentBackground);
        } else {
            this.mActivityChooserContent.setBackgroundDrawable(null);
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mActivityChooserContent.layout(0, 0, i3 - i, i4 - i2);
        if (!isShowingPopup()) {
            dismissPopup();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mModelDataSetObserver = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1172900388) {
                    super.onChanged();
                    return null;
                } else if (hashCode == 1641176753) {
                    super.onInvalidated();
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/appcompat/widget/ActivityChooserView$1");
                }
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                super.onChanged();
                ActivityChooserView.this.mAdapter.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
                    return;
                }
                super.onInvalidated();
                ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
            }
        };
        this.mOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                } else if (!ActivityChooserView.this.isShowingPopup()) {
                } else {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().dismiss();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().show();
                    ActionProvider actionProvider = ActivityChooserView.this.mProvider;
                    if (actionProvider != null) {
                        actionProvider.subUiVisibilityChanged(true);
                    }
                }
            }
        };
        this.mInitialActivityCount = 4;
        int[] iArr = R.styleable.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.mInitialActivityCount = obtainStyledAttributes.getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        Callbacks callbacks = new Callbacks();
        this.mCallbacks = callbacks;
        View findViewById = findViewById(R.id.activity_chooser_view_content);
        this.mActivityChooserContent = findViewById;
        this.mActivityChooserContentBackground = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.mDefaultActivityButton = frameLayout;
        frameLayout.setOnClickListener(callbacks);
        frameLayout.setOnLongClickListener(callbacks);
        int i2 = R.id.image;
        this.mDefaultActivityButtonImage = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(callbacks);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: androidx.appcompat.widget.ActivityChooserView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                if (str.hashCode() == -1877873384) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfo) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/ActivityChooserView$3");
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9011ed18", new Object[]{this, view, accessibilityNodeInfo});
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
            }
        });
        frameLayout2.setOnTouchListener(new ForwardingListener(frameLayout2) { // from class: androidx.appcompat.widget.ActivityChooserView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/ActivityChooserView$4");
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public ShowableListMenu getPopup() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ShowableListMenu) ipChange.ipc$dispatch("40fb28e2", new Object[]{this});
                }
                return ActivityChooserView.this.getListPopupWindow();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStarted() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("375014b0", new Object[]{this})).booleanValue();
                }
                ActivityChooserView.this.showPopup();
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStopped() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("afb2dffc", new Object[]{this})).booleanValue();
                }
                ActivityChooserView.this.dismissPopup();
                return true;
            }
        });
        this.mExpandActivityOverflowButton = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.mExpandActivityOverflowButtonImage = imageView;
        imageView.setImageDrawable(drawable);
        ActivityChooserViewAdapter activityChooserViewAdapter = new ActivityChooserViewAdapter();
        this.mAdapter = activityChooserViewAdapter;
        activityChooserViewAdapter.registerDataSetObserver(new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                if (str.hashCode() == -1172900388) {
                    super.onChanged();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/ActivityChooserView$5");
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                super.onChanged();
                ActivityChooserView.this.updateAppearance();
            }
        });
        Resources resources = context.getResources();
        this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showPopupUnchecked(int r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.appcompat.widget.ActivityChooserView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r5
            r6[r0] = r3
            java.lang.String r0 = "efd27abd"
            r2.ipc$dispatch(r0, r6)
            return
        L_0x001b:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r2 = r5.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r2 = r2.getDataModel()
            if (r2 == 0) goto L_0x00af
            android.view.ViewTreeObserver r2 = r5.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r5.mOnGlobalLayoutListener
            r2.addOnGlobalLayoutListener(r3)
            android.widget.FrameLayout r2 = r5.mDefaultActivityButton
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            int r3 = r3.getActivityCount()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r4) goto L_0x0052
            int r4 = r6 + r2
            if (r3 <= r4) goto L_0x0052
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            r3.setShowFooterView(r0)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            int r6 = r6 - r0
            r3.setMaxActivityCount(r6)
            goto L_0x005c
        L_0x0052:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            r3.setShowFooterView(r1)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            r3.setMaxActivityCount(r6)
        L_0x005c:
            androidx.appcompat.widget.ListPopupWindow r6 = r5.getListPopupWindow()
            boolean r3 = r6.isShowing()
            if (r3 != 0) goto L_0x00ae
            boolean r3 = r5.mIsSelectingDefaultActivity
            if (r3 != 0) goto L_0x0073
            if (r2 != 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r2 = r5.mAdapter
            r2.setShowDefaultActivity(r1, r1)
            goto L_0x0078
        L_0x0073:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            r3.setShowDefaultActivity(r0, r2)
        L_0x0078:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r2 = r5.mAdapter
            int r2 = r2.measureContentWidth()
            int r3 = r5.mListPopupMaxWidth
            int r2 = java.lang.Math.min(r2, r3)
            r6.setContentWidth(r2)
            r6.show()
            androidx.core.view.ActionProvider r2 = r5.mProvider
            if (r2 == 0) goto L_0x0091
            r2.subUiVisibilityChanged(r0)
        L_0x0091:
            android.widget.ListView r0 = r6.getListView()
            android.content.Context r2 = r5.getContext()
            int r3 = com.taobao.taobao.R.string.abc_activitychooserview_choose_application
            java.lang.String r2 = r2.getString(r3)
            r0.setContentDescription(r2)
            android.widget.ListView r6 = r6.getListView()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r6.setSelector(r0)
        L_0x00ae:
            return
        L_0x00af:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No data model. Did you call #setDataModel?"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.showPopupUnchecked(int):void");
    }
}
