package com.parsonswang.zxfootball.matches;

import com.parsonswang.common.network.JsonCallback;
import com.parsonswang.zxfootball.bean.MatchesBean;

import okhttp3.Call;

/**
 * Created by parsonswang on 2017/10/20.
 */

public class MachesFetchDataCallback extends JsonCallback<MatchesBean> {

    @Override
    protected void onSucess(MatchesBean matchesBean) {

    }

    @Override
    protected void onFail(Call call, String reson) {

    }
}
