class StaticPagesController < ApplicationController

  def home
    if signed_in?
      @micropost = current_user.microposts.build
      @feed_items = current_user.feed #.paginate(:page=> params[:page])
    end
  end

  def contact
  end

  def about
  end

  def help
  end

  def home_mobile
    if signed_in?
      @micropost = current_user.microposts.build
      @feed_items = current_user.feed #.paginate(:page=> params[:page])
    end
  end

  def home_post
    if signed_in?
      @micropost = current_user.microposts.build
      @feed_items = current_user.feed #.paginate(:page=> params[:page])
    end
  end
end
