package com.taobao.login4android.membercenter.account.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.LoadImageTask;
import com.ali.user.mobile.utils.StringUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewAccountAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isDeleteMode = false;
    private OnButtonClickListener mConfirmClickListener;
    private Context mContext;
    private OnButtonClickListener mDeleteClickListener;
    private List<SessionModel> mListAccounts;
    private ListView mListView;
    private boolean mLoginMode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface OnButtonClickListener {
        void click(View view, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class ViewHolder {
        public ImageView avatarIV;
        public View clickView;
        public Button confirmBtn;
        public TextView currentTV;
        public Button deleteBtn;
        public TextView selectedUserTV;
        public TextView userInputTV;
        public TextView xTV;

        static {
            t2o.a(70254959);
        }

        public ViewHolder(View view) {
            this.avatarIV = (ImageView) view.findViewById(R.id.aliuser_account_item_avatar);
            this.userInputTV = (TextView) view.findViewById(R.id.aliuser_account_item_userinput);
            this.selectedUserTV = (TextView) view.findViewById(R.id.aliuser_account_item_selected);
            this.deleteBtn = (Button) view.findViewById(R.id.aliuser_account_item_delete_btn);
            this.confirmBtn = (Button) view.findViewById(R.id.aliuser_account_item_confirm_btn);
            this.currentTV = (TextView) view.findViewById(R.id.aliuser_account_item_current);
            this.clickView = view.findViewById(R.id.aliuser_click_ll);
            this.xTV = (TextView) view.findViewById(R.id.aliuser_x_tv);
        }
    }

    static {
        t2o.a(70254955);
    }

    public NewAccountAdapter(Context context, ListView listView, List<SessionModel> list, boolean z) {
        this.mLoginMode = false;
        this.mContext = context;
        this.mListView = listView;
        this.mListAccounts = new ArrayList(list);
        this.mLoginMode = z;
        ImageUtil.emptyMemoryCache();
        LoadImageTask.rmImagePath(context, "ListHeadImages");
    }

    public static /* synthetic */ OnButtonClickListener access$000(NewAccountAdapter newAccountAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnButtonClickListener) ipChange.ipc$dispatch("eda65598", new Object[]{newAccountAdapter});
        }
        return newAccountAdapter.mDeleteClickListener;
    }

    public static /* synthetic */ OnButtonClickListener access$100(NewAccountAdapter newAccountAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnButtonClickListener) ipChange.ipc$dispatch("d4e4f337", new Object[]{newAccountAdapter});
        }
        return newAccountAdapter.mConfirmClickListener;
    }

    public static /* synthetic */ Object ipc$super(NewAccountAdapter newAccountAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/account/adapter/NewAccountAdapter");
    }

    public String getAccount(SessionModel sessionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79fe8144", new Object[]{this, sessionModel});
        }
        String str = sessionModel.showLoginId;
        if (TextUtils.isEmpty(str)) {
            return sessionModel.nick;
        }
        return str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<SessionModel> list = this.mListAccounts;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<SessionModel> list = this.mListAccounts;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.mListAccounts.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        View view2;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view2 = LayoutInflater.from(this.mContext).inflate(R.layout.aliuser_multiaccount_list_item_layout, (ViewGroup) null);
            viewHolder = new ViewHolder(view2);
            view2.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
            view2 = view;
        }
        try {
            SessionModel sessionModel = this.mListAccounts.get(i);
            viewHolder.userInputTV.setText(StringUtil.dataMasking(getAccount(sessionModel), true));
            if (!TextUtils.isEmpty(sessionModel.headPicLink)) {
                viewHolder.avatarIV.setTag(sessionModel.headPicLink);
                new LoadImageTask(DataProviderFactory.getApplicationContext(), this.mListView, "ListHeadImages", 160, true, this.mLoginMode).execute(sessionModel.headPicLink);
            } else {
                viewHolder.avatarIV.setImageResource(R.drawable.aliuser_placeholder);
            }
            if (!TextUtils.isEmpty(sessionModel.expTags)) {
                JSONArray jSONArray = new JSONArray(sessionModel.expTags);
                String str = "";
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    str = str + "  " + jSONArray.getString(i2) + "  ";
                }
                SpannableString spannableString = new SpannableString(str);
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    String str2 = " " + jSONArray.getString(i3) + " ";
                    int indexOf = str.indexOf(str2);
                    int length = str2.length() + indexOf;
                    if (length > indexOf) {
                        spannableString.setSpan(new BackgroundColorSpan(Color.parseColor("#e6e6e6")), indexOf, length, 33);
                    }
                }
                viewHolder.xTV.setTextColor(Color.parseColor("#676767"));
                viewHolder.xTV.setText(spannableString);
                viewHolder.xTV.setVisibility(0);
            } else {
                viewHolder.xTV.setVisibility(8);
            }
            if (this.mLoginMode) {
                if (i == 0) {
                    viewHolder.selectedUserTV.setText(R.string.aliuser_multi_account_last_user);
                    viewHolder.selectedUserTV.setVisibility(0);
                } else {
                    viewHolder.selectedUserTV.setVisibility(8);
                }
                viewHolder.confirmBtn.setText(R.string.aliuser_login_title);
                if (!LanguageUtil.isChineseLanguage() && (context = this.mContext) != null) {
                    float f = context.getResources().getDisplayMetrics().density;
                    ViewGroup.LayoutParams layoutParams = viewHolder.confirmBtn.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = (int) (80.0f * f);
                        viewHolder.confirmBtn.setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = viewHolder.userInputTV.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = (int) (f * 152.0f);
                        viewHolder.userInputTV.setLayoutParams(layoutParams2);
                    }
                }
            } else {
                viewHolder.selectedUserTV.setVisibility(8);
                viewHolder.confirmBtn.setText(R.string.aliuser_change_title);
                if (AccountHelper.isCurrentLoginUser(sessionModel)) {
                    viewHolder.currentTV.setText(R.string.aliuser_multi_account_current_user);
                    viewHolder.currentTV.setVisibility(0);
                    viewHolder.confirmBtn.setVisibility(4);
                } else {
                    viewHolder.currentTV.setVisibility(8);
                    viewHolder.confirmBtn.setVisibility(0);
                }
            }
            if (this.isDeleteMode) {
                viewHolder.deleteBtn.setVisibility(0);
                viewHolder.confirmBtn.setVisibility(4);
                viewHolder.currentTV.setVisibility(8);
                if (this.mDeleteClickListener != null) {
                    viewHolder.deleteBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                            } else {
                                NewAccountAdapter.access$000(NewAccountAdapter.this).click(view3, i);
                            }
                        }
                    });
                }
            } else {
                viewHolder.deleteBtn.setVisibility(8);
                if (this.mConfirmClickListener != null) {
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                            } else {
                                NewAccountAdapter.access$100(NewAccountAdapter.this).click(view3, i);
                            }
                        }
                    };
                    viewHolder.confirmBtn.setOnClickListener(onClickListener);
                    ViewProxy.setOnClickListener(viewHolder.clickView, onClickListener);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return view2;
    }

    public boolean isDeleteMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74acb43", new Object[]{this})).booleanValue();
        }
        return this.isDeleteMode;
    }

    public void setConfirmClickListener(OnButtonClickListener onButtonClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b120d7", new Object[]{this, onButtonClickListener});
        } else {
            this.mConfirmClickListener = onButtonClickListener;
        }
    }

    public void setDeleteMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce82493d", new Object[]{this, new Boolean(z)});
        } else {
            this.isDeleteMode = z;
        }
    }

    public void setOnDeleteClickListener(OnButtonClickListener onButtonClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef267c5", new Object[]{this, onButtonClickListener});
        } else {
            this.mDeleteClickListener = onButtonClickListener;
        }
    }
}
